package Projeto003EstruturasRepeticaoeArraysJava;

import java.util.Scanner;

public class EstruturasdeRepetiçãoPareImpar {
     
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int count = 0;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantitdade de números: ");
        quantNumeros = scan.nextInt();

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++;
        } while (count < quantNumeros);

        System.out.println("Quantidade de pares: " + quantPares);
        System.out.println("Quantidade de ímpares: " + quantImpares);
        System.out.println("Continua aqui...");
    }
}