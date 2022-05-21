package application;

import entities.Account;
import entities.exceptions.DomainExceptions;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withDrawLimit = sc.nextDouble();

            Account acc = new Account(number, holder, initialBalance, withDrawLimit);

            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();

            acc.withDraw(amount);

        }
        catch (DomainExceptions e) {
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Erro inesperado!");
        }
        finally {
            System.out.println("Programa finalizado!");
        }




        sc.close();
    }
}
