package Parte003EstruturasRepeticaoeArraysJava.src;

import java.util.Scanner;

public class EstruturasdeRepetiçãoNota {
     
    @SuppressWarnings("resource")
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 | nota > 10){
            System.out.println("Nota inválida! Digite novamente: ");
            nota = scan.nextInt();
        }

        System.out.println("Continua aqui...");
    }
}
