package Parte003EstruturasRepeticaoeArraysJava.src;
import java.util.concurrent.ThreadLocalRandom;
// Esse import acima, foi para gerar aleatóriamente um valor para a simulação.

public class EstruturasdeRepetiçãoWhile {

    public static void main(String[] args) {
        
        double mesada = 50.0;
        while ( mesada > 0 ) {
            double valorDoce = valorAleatorio();

            if(valorDoce > mesada)
                valorDoce = mesada;
            System.out.println("Doce do valor: " + valorDoce + " adicionado ao carrinho!");    
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada );
        System.out.println("Jhonn gastou toda sua mesada em doces!");

    }

    private static double valorAleatorio(){ // O import foi usado aqui, buscando um valor Double.
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
    
}
