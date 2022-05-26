package model.entities;

import model.services.PaymentService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
    private Integer number;
    private Date date;
    private double totalValue;

    List<Installment> installments = new ArrayList<>();

    public Contract(){

    }

    public Contract(Integer number, Date date, double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public Integer getNumber() {
        return number;
    }

    public Date getDate() {
        return date;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

}
