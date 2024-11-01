package Desafios.src;

import java.util.Scanner;

public class ImprimirNomesEspecificos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define o tamanho do array para 10 nomes
        String[] nomes = new String[10];

        // Lê os 10 nomes e armazena no array
        for (int i = 0; i < 10; i++) {
            nomes[i] = sc.nextLine();
        }

        // Imprime o terceiro, sétimo e nono nomes
        System.out.println(nomes[2]);
        System.out.println(nomes[6]);
        System.out.println(nomes[8]);

        sc.close();
    }
}