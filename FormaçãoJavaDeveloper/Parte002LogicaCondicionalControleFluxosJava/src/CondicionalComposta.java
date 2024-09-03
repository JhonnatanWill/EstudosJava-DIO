package Parte002LogicaCondicionalControleFluxosJava.src;

import java.util.Scanner;

public class CondicionalComposta {
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double saldo = 25.0;
        double valorSolicitado;
        String falha = "Saldo insuficiente!";

        System.out.println("Quanto você deseja sacar?");
        valorSolicitado = leitor.nextDouble();

        // Usando chaves para definir o bloco do if
        if (valorSolicitado <= saldo) { 
            // Este bloco de código será executado se a condição for verdadeira
            saldo = saldo - valorSolicitado;
            System.out.println(saldo);
        } else { 
            // Este bloco de código será executado se a condição for falsa
            System.out.println(falha);
        }

    }

}
