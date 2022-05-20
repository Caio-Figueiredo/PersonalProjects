package entities;

public class OutsorcedEmployee extends Employee{

    protected double addiotionalCharge;

    @Override
    public double payment(){
        return super.payment() + addiotionalCharge * 1.1;
    }

    public OutsorcedEmployee(double addiotionalCharge) {
        this.addiotionalCharge = addiotionalCharge;
    }

    public OutsorcedEmployee(String name, Integer hours, double valuePerHour, double addiotionalCharge) {
        super(name, hours, valuePerHour);
        this.addiotionalCharge = addiotionalCharge;
    }

    public double getAddiotionalCharge() {
        return addiotionalCharge;
    }

    public void setAddiotionalCharge(double addiotionalCharge) {
        this.addiotionalCharge = addiotionalCharge;
    }
}
