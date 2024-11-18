package Desafios.src;
import java.util.Scanner;

public class Contador {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        // Solicita os dois números ao usuário
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        // Tenta executar a contagem, tratando possíveis exceções
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // Imprime a mensagem de erro personalizada da exceção
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verifica se o segundo parâmetro é maior que o primeiro
        if (parametroUm > parametroDois) {
            // Lança uma exceção personalizada se a condição não for atendida
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Calcula a quantidade de números a serem impressos
        int contagem = parametroDois - parametroUm;

        // Itera para imprimir cada número da sequência
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

// Classe para representar a exceção personalizada
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}