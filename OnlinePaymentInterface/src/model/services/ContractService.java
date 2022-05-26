package model.services;

import model.entities.Contract;
import model.entities.Installment;
import model.services.PaymentService;

import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class ContractService {
    private PaymentService paymentService;
    Date date;

    public ContractService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, int months){
        double basicQuota = contract.getTotalValue()/months;

        for(int i=0;i<months;i++){
            double updatedQuota = basicQuota + paymentService.interest(basicQuota, i);
            double fullQuota = updatedQuota + paymentService.paymentFee(updatedQuota);

            Date dueDate = addmonths(contract.getDate(),i);

            contract.getInstallments().add(new Installment(dueDate, fullQuota));
        }
    }

    private Date addmonths(Date date, int N) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, N);
        return cal.getTime();
    }
}
