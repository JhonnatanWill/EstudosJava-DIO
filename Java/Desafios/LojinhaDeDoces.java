package Desafios;

/* Uma lojinha de doces tem muitos clientes por ser
ao lado de uma escola. Para aumentar as vendas o dono
resolveu colocar uma máquina onde os clientes,
principalmente as crianças que estão muito acostumadas
com a tecnologia, poderiam colocar suas moedas e receber
dois doces aleatórios. Cada 1 real irá render 2 doces aleatórios. */

import java.util.Scanner;

public class LojinhaDeDoces {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dinheiro = leitor.nextInt();
        
        System.out.println("O cliente obteve " + dinheiro * 2 + " doces");

        // TODO: Crie a condição necessária para que cada cliente saiba quantos doces vai obter de acordo com a entrada

    }

}