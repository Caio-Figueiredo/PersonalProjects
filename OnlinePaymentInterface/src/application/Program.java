package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaymentService;
import model.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        PaymentService paymentService = new PaypalService();
        ContractService cs = new ContractService(paymentService);


        try {
            System.out.println("Enter contract data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Date: ");
            Date date = sdf.parse(sc.nextLine());
            System.out.print("Contract value: ");
            double contractValue = sc.nextDouble();
            System.out.print("Enter number of installments: ");
            int installmentsNbr = sc.nextInt();

            Contract contract = new Contract(number, date, contractValue);

            cs.processContract(contract, installmentsNbr);

            System.out.println("Installments: ");
            for (Installment it : contract.getInstallments()) {
                System.out.println(it);
            }
        }
        catch (ParseException e){
            e.printStackTrace();
        }
        finally {
            sc.close();
        }
    }
}
