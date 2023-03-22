package Projeto003EstruturasRepeticaoeArraysJava;

import java.util.Scanner;

public class EstruturasdeRepetiçãoFatorial {
     
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Desejas o fatorial de qual número? ");
        int fatorial = scan.nextInt();
        int multiplicaao = 1;

        System.out.print(fatorial +"! = ");
        for ( int i = fatorial ; i >= 1 ; i-- ){
            multiplicaao = multiplicaao * i;
        }

        System.out.println(multiplicaao);
    }
}