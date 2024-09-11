package Parte002LogicaCondicionalControleFluxosJava.src;

public class CondicionalEncadeada {
    
    public static void main(String[] args) {
        
        // Declara uma variável inteira para armazenar a nota do aluno
        int nota = 8;

        // Verifica se a nota é maior ou igual a 7
        if (nota >= 7) {
            // Se a condição for verdadeira, o aluno está aprovado
            System.out.println("Aprovado!");
        } 
        // Se a nota não for maior ou igual a 7, verifica se está entre 5 e 7
        else if (nota >= 5 && nota < 7) {
            // Se a condição for verdadeira, o aluno terá prova de recuperação
            System.out.println("Prova de recuperação!");
        } 
        // Se nenhuma das condições anteriores for verdadeira, o aluno está reprovado
        else {
            System.out.println("Reprovado!");
        }
    }
}