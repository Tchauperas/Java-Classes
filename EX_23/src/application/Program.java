package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Product;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ArrayList<Product> list = new ArrayList<>();

        System.out.print("Enter file path: ");
        String sourceFileStr = sc.nextLine(); //Caminho do arquivo

        File sourceFile = new File(sourceFileStr); //Variável tipo file que recebe o caminho em formato de string e tranforma em File
        String sourceFoulderStr = sourceFile.getParent(); //Pega o diretório do aquivo do caminho em questão

        boolean success = new File(sourceFoulderStr + "\\out").mkdir(); //Cria uma pasta e retorna um valor booleano como confimação

        System.out.println("Folder created: " + success);

        String targetFileStr = sourceFoulderStr + "\\out\\sumerry.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
            String itemCSV = br.readLine();
            while (itemCSV != null) {
                String[] fields = itemCSV.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                itemCSV = br.readLine();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
                for (Product item : list) {
                    bw.write(item.getName() + "," + String.format("%.2f", item.total()));
                    bw.newLine();
                }
                System.out.println(targetFileStr + " Created");
            } catch (IOException e) {
                System.out.println("An error has acurred: " + e.getMessage());
            }
        } catch(IOException e) {
            System.out.println("A error has ocurred" + e.getMessage());
        }

        sc.close();
    }
}
