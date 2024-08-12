package Desafios;

/* Você foi contratado para criar um gerenciador de pacotes.
Porém, o que restou para você fazer foi o contador de porcentagem
de download dos pacotes. Mas como o espaço para essa informação
ficou pequeno, a empresa optou por fazer uma escala de 10 – 1.
Então a escala será 1 = 10%, 2 = 20%, 3 = 30% e etc.
Para cada 10% de download, o programa deve printar, em sequência
e sem espaços, uma barra “/”. */

import java.util.Scanner;

public class DownloadDePacotes {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quantos porcento?");
        int tamanho = leitor.nextInt();

        if (tamanho == 1) {
            System.out.println("/");
        } else if (tamanho == 2) {
            System.out.println("//");
        } else if (tamanho == 3) {
            System.out.println("///");
        } else if (tamanho == 4) {
            System.out.println("////");
        } else if (tamanho == 5) {
            System.out.println("/////");
        } else if (tamanho == 6) {
            System.out.println("//////");
        } else if (tamanho == 7) {
            System.out.println("///////");
        } else if (tamanho == 8) {
            System.out.println("////////");
        } else if (tamanho == 9) {
            System.out.println("/////////");
        } else if (tamanho == 10) {
            System.out.println("//////////");
        } else {
            System.out.println("Porcentagem inválida!");
        }

        // TODO: Crie a condição necessária para que o sobrinho saiba quanto dinheiro irá juntar nos meses da entrada

    }

}
