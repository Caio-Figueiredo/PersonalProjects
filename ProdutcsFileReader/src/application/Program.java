package application;

import entities.Products;

import java.io.*;
import java.util.*;

public class Program {
    public static void main(String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Products> products = new ArrayList<>();

        String path = "c:/Teste/in/in.txt";
        String outPath = "c:/Teste/out/out.txt";


        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String[] extraction = null;
            String line = br.readLine();

            while (line != null) {
                extraction = line.split(",");
                line = br.readLine();
                String name = extraction[0];
                double value = Double.parseDouble(extraction[1]);
                int quantity = Integer.parseInt(extraction[2]);

                products.add(new Products(name, value, quantity));

                System.out.println("Linha contabilizada com sucesso: "+ line);
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter((outPath)))) {
                for (Products product : products) {
                    bw.write("Produto: " + product.getName() + ", " + "Valor total: " + product.total());
                    bw.newLine();
                }
            }
            catch (IOException e){
                System.out.println("Erro inesperado:" + e.getMessage());
            }

        }
        catch (IOException e){
            System.out.println("Erro inesperado:" + e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}
