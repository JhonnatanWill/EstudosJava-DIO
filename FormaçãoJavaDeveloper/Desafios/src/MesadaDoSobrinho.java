package Desafios.src;

/* Seu sobrinho começou a ganhar mesada dos pais. No auge
dos seus 8 anos recebendo 50 reais por mês, ele quer saber
quanto terá se juntar todo o dinheiro, sem gastar nada, durante
alguns meses. E você, como um bom tio com habilidades de
programação, vai criar um programa que com as entradas do
seu sobrinho vai calcular automaticamente a quantidade de
dinheiro que ele terá em X meses. */

import java.util.Scanner;

public class MesadaDoSobrinho {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int entrada;
        int mesada = 50;
        
        System.out.println("Quantos meses você vai juntar? ");
        entrada = leitor.nextInt();
        
        System.out.println("Em " + entrada + " você terá R$:" + entrada * mesada + ",00 juntados!");

        // TODO: Crie a condição necessária para que o sobrinho saiba quanto dinheiro irá juntar nos meses da entrada

    }
}
