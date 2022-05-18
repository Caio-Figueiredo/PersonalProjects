package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        int validationId = 0;

        System.out.print("How many employees will be registered?:");
        int employeeRegNbr = sc.nextInt();


        for(int i = 0; i < employeeRegNbr;i++){
            System.out.print("Employee #" + (i + 1) + ":" + "\n");
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employees.add(new Employee(id, name, salary));
        }

        System.out.print("Enter the employee id that will have salary increased: ");
        int employeeId = sc.nextInt();


        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).getId() == employeeId){
                validationId = i;
                break;
            } else {
                validationId = -1;
            }
        }

        if (validationId != -1) {
            System.out.print("Raise percentage?: ");
            int percentage = sc.nextInt();
            employees.get(validationId).increaseSalary(percentage);
        } else {
            System.out.println("ID does not exists.");
        }

        System.out.print("");
        for(Employee key : employees) {
            System.out.print(key);
        }

        sc.close();
    }
}
