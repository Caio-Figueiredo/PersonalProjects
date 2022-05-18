package application;

import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main (String [] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluno al = new Aluno();

        System.out.println("Entrada de Dados:");
        al.name = sc.nextLine();
        al.grade1 = sc.nextDouble();
        al.grade2 = sc.nextDouble();
        al.grade3 = sc.nextDouble();
        System.out.println("");
        sc.close();

        al.calcNota();

        al.validarNota();



    }


}
