package Parte003EstruturasRepeticaoeArraysJava;

import java.util.Random;

public class ArraysNumerosAleatorios {
    
    public static void main(String[] args){

        Random random = new Random();

        int[] numerosAleaorios = new int[20];

        for(int i = 0; i < numerosAleaorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleaorios[i] = numero;
        }

        System.out.print("Números aleatórios: ");
        for (int numero : numerosAleaorios) {
            System.out.print(numero + " ");
        }

        System.out.print("\nSucessores dos números aleatórios: ");
        for (int numero : numerosAleaorios) {
            System.out.print((numero+1) + " ");
        }
    }
}
