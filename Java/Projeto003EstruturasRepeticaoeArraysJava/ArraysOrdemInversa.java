package Projeto003EstruturasRepeticaoeArraysJava;

public class ArraysOrdemInversa {
    
    public static void main(String[] args){

        int[] vetor = {15,84,65,32,45,21};

        System.out.println("Vetor: ");
        int count = 0;
        while(count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVetor na ordem inversa: ");
        for(int i = (vetor.length - 1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
