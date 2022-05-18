package application;

import util.Converter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    

    public static void main (String [] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price?:");
        Converter.dolar = sc.nextDouble();
        System.out.print("How many dollars will be bought?:");
        Converter.quantity = sc.nextDouble();
        System.out.print("Amount to be paid in reals: R$" + Converter.convert());


        sc.close();
    }
}
