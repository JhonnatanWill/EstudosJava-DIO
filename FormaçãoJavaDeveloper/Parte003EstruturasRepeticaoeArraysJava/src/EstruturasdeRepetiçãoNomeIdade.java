package Parte003EstruturasRepeticaoeArraysJava.src;

import java.util.Scanner;

public class EstruturasdeRepetiçãoNomeIdade {
     
    @SuppressWarnings("resource")
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String nome;
        while(true){
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
        }

        System.out.println("Continua aqui...");
    }
}
