package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
     
        String[] lines = new String[] {"Dia", "Tarde", "Noite"};

        String path = "C:\\Users\\Marcos\\Documents\\My Projects\\Java-Classes\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
