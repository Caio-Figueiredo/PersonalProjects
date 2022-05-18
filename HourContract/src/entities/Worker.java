package entities;

import entities.enums.WorkerLevel;

import java.text.SimpleDateFormat;
import java.util.*;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;

    Date date = new Date();

    List<HourContract> contracts = new ArrayList<>();
    SimpleDateFormat sdf = new SimpleDateFormat();


    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public double income(Integer year, Integer month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c : contracts){
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = cal.get(Calendar.MONTH);
            if (c_year == year && c_month == month) {
                sum = baseSalary + c.totalValue();
            }
        }
        return sum;
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getDepartment() {
        return department.getName();
    }


    public List<HourContract> getContracts() {
        return contracts;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Department: " + getDepartment() + "\n";
    }
}
