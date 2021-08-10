package application;


import java.io.File;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String strPath = sc.nextLine();

        File path = new File(strPath);
        System.out.println("getName: " + path.getName()); // getName: exibe apenas o nome do arquivo.
        System.out.println("getParent: " + path.getParent()); // getParent: exibe apenas o caminho do arquivo.
        System.out.println("getPath: " + path.getPath()); //getPath: exibe o caminho completo.
    }
}
