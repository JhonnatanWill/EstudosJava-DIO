package Parte003EstruturasRepeticaoeArraysJava;

import java.util.Scanner;

public class EstruturasdeRepetiçãoMaioreMedia {
     
    @SuppressWarnings("resource")
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int count = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            count = count + 1;
        } while(count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma / count));
        System.out.println("Continua aqui...");
    }
}
