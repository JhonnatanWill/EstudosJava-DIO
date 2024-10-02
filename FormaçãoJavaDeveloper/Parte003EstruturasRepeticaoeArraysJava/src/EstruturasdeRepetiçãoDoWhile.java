package Parte003EstruturasRepeticaoeArraysJava.src;
import java.util.Random;
// Esse import acima, foi para gerar aleatóriamente uma condição para a simulação.

public class EstruturasdeRepetiçãoDoWhile {

    public static void main(String[] args) {
        
        System.out.println("Discando...");

        do {
            // Executando repetidas vezes até alguem atender...
            System.out.println("Telefone tocando!");

        } while (tocando());

        System.out.println("Alô!!");

    }

    private static boolean tocando(){ // O import foi usado aqui, buscando um valor Double.
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        // Negando o ato de continuar tocando...
        return ! atendeu;
    }
    
}
