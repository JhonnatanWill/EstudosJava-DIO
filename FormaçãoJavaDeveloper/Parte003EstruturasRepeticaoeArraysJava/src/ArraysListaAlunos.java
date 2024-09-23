package Parte003EstruturasRepeticaoeArraysJava.src;

public class ArraysListaAlunos {
    
    public static void main(String[] args) {
        
        String alunos [] = {"Jhonnatan", "Willian", "Raphael", "Felipe", "Erinaldo", "Júnior" };
    
        for (int x=0; x < alunos.length; x++){

            System.out.println("O aluno no indice X=" + x + " é " + alunos [x] );

        }

        for (String aluno : alunos){

            System.out.println("Nome do aluno é: " + aluno);

        }
    }
}
