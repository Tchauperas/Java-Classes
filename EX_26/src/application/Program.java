package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        
        String path = "C://temp//in.txt";
        Map<String, Integer> votes = new TreeMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while(line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                String vote = fields[1];
                int intVote = Integer.parseInt(vote);

                votes.put(name, intVote);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
