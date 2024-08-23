package Desafios.src;

import java.util.Scanner;

/*
Você receberá dois valores inteiros. Faça a leitura e em seguida calcule o 
produto entre estes dois valores. Atribua esta operação à variável PROD, 
mostrando esta de acordo com a mensagem de saída esperada (exemplo abaixo).   

Entrada
A entrada contém 2 valores inteiros.

Saída
Exiba a variável PROD conforme exemplo abaixo, tendo obrigatoriamente um 
espaço em branco antes e depois da igualdade.
*/

public class MultiplicaçãoSimples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, PROD;
		
        System.out.println("Qual o valor A? ");
		A = sc.nextInt();
        
        System.out.println("Qual o valor B? ");
		B = sc.nextInt();
		 //TODO: Complete os espaços em branco com uma possível solução para o desafio 
        PROD = A * B;

		System.out.println("PROD = " + PROD);
	}
}