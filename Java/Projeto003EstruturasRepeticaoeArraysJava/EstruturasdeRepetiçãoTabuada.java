package Projeto003EstruturasRepeticaoeArraysJava;

import java.util.Scanner;

public class EstruturasdeRepetiçãoTabuada {
     
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada de qual número?");
        int tabuada = scan.nextInt();

        System.out.println("Até quantas vezes? ");
        int vezes = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for (int i = 1; i <= vezes; i++){
            System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
        }
    }
}