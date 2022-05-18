package application;

import entities.Room;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de quartos a serem alugados:");
        int roomQt = sc.nextInt();
        sc.nextLine();
        Room[] room = new Room[roomQt];

        for(int i = 0; i < room.length; i++) {
            System.out.print("Escolha seu quarto:");
            int roomNbr = sc.nextInt();
            sc.nextLine();
            System.out.println("Rent #" + roomNbr);
            System.out.printf("Digite o nome do hóspede:");
            String clientName = sc.nextLine();
            System.out.printf("Digite o email do hóspede:");
            String clientEmail = sc.nextLine();

            room[i] = new Room(roomNbr, clientName, clientEmail);
        }

        System.out.println("Busy rooms:");

        for(int i = 0; i < room.length; i++){

            if (room[i] != null){
                System.out.println(room[i].toString());
            } else {
                System.out.println("Quarto vago!");
            }


        }


        sc.close();
    }

}
