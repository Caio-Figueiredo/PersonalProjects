package application;

import entities.Employee;
import entities.OutsorcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.println("Enter the number of employees: ");
        int nbrEmp = sc.nextInt();

        for(int i = 0; i < nbrEmp; i++){
            System.out.println("Employee #" + (i + 1) + " data: ");
            System.out.println("Outsorced (y/n)?");
            String response = sc.next();
            sc.nextLine();

            if(response.charAt(0) == 'y'){
                System.out.print("Name: ");
                String name= sc.nextLine();

                System.out.print("Hours: ");
                int hours = sc.nextInt();

                System.out.print("Value per hour: ");
                double valuePerHour = sc.nextDouble();

                System.out.print("Additional charge: ");
                double additionalCharge= sc.nextDouble();

                employees.add(new OutsorcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                System.out.print("Name: ");
                String name= sc.nextLine();

                System.out.print("Hours: ");
                int hours = sc.nextInt();

                System.out.print("Value per hour: ");
                double valuePerHour = sc.nextDouble();

                employees.add(new Employee(name, hours, valuePerHour));
            }

        }

        System.out.println("PAYMENTS: ");
        for (Employee e : employees) {
            System.out.println(e.getName() + " - $ " + e.payment());
        }

        sc.close();
    }

}
