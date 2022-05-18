package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.US;

public class Program {
    public static void main(String [] args){
        Locale.setDefault(US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number:");
        Integer accountNumber = sc.nextInt();


        System.out.print("Enter account holder:");
        String name = sc.next();


        System.out.print("Is there any initial deposit?(y/n)");
        String choice = sc.next();



        if(choice.equals("y")){
            System.out.print("Enter initial deposit value:");
            double dep = sc.nextDouble();
            account = new Account(name, accountNumber, dep);
        } else {
            account = new Account(name, accountNumber);
        }

        System.out.println("Account data:");
        System.out.print(account);

        System.out.print("Enter a deposit value:");
        double dep = sc.nextDouble();

        account.deposit(dep);
        System.out.println("Updated data:");
        System.out.println(account);

        System.out.print("Enter a withdraw value:");
        double withD = sc.nextDouble();

        account.withDraw(withD);
        System.out.println("Updated data:");
        System.out.println(account);




        sc.close();
    }


}
