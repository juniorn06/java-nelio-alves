package application;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {

        String[] lines = new String[]{ "Good morning", "Good Afternoon", "Good night"};

        String path = "C:\\Users\\TI\\Documents\\Java\\Workspace\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines){
                bw.write(line);
                bw.newLine(); // Acrescenta uma quebra de linha.
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
