package entities;

public class Employee {

    public String name;
    public double tax, grossSalary;

    public double NetSalary() {

        return grossSalary - tax;

    }

    public void IncreaseSalary(double percentage) {

        double calc = (grossSalary * percentage) / 100;
        grossSalary += calc;

    }

    @Override
    public String toString() {
        return  name + ", " + "R$ " + String.format("%.2f", NetSalary());
    }
}
