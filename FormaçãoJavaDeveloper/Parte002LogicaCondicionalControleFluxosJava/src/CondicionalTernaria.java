package Parte002LogicaCondicionalControleFluxosJava.src;

public class CondicionalTernaria {

    public static void main(String[] args) {
        
        // Declara uma variável inteira para armazenar a nota do aluno
        int nota = 8;

        // Utiliza o operador ternário para definir o resultado com base na nota
        String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";

        // Imprime o resultado na tela
        System.out.println(resultado);
    }
}
