package Parte002LogicaCondicionalControleFluxosJava.src;

public class CondicionalSwitchCase {

    /* Esse primeiro é uma simulação de como seria de forma encadeada.

    public static void main(String[] args) {
        
        String sigla = "M";

        if (sigla == "P")
            System.out.println("Pequeno");
        else if (sigla == "M")
            System.out.println("Médio");
        else if (sigla == "G")
            System.out.println("Grande");
        else
            System.out.println("Indefinido");
        
    }
    */
    
    /*Esse segundo código é basicamente o mesmo acima, mas de forma de SwitchCase com o Break, imprimindo apenas o argumeto correto.
    public static void main(String[] args) {
        
        // Declara uma variável String para armazenar a sigla
        String sigla = "M";

        // Utiliza a instrução switch para avaliar a sigla e executar o bloco correspondente
        switch (sigla) {
            
            // Caso a sigla seja "P"
            case "P": {
            System.out.println("Pequeno");
            break; // Encerra o switch
            }
            // Caso a sigla seja "M"
            case "M": {
            System.out.println("Médio");
            break; // Encerra o switch
            }
            // Caso a sigla seja "G"
            case "G": {
            System.out.println("Grande");
            break; // Encerra o switch
            }
            // Caso a sigla não corresponda a nenhum dos casos anteriores
            default: {
            System.out.println("Indefinido");
            }
        }
    }
    */

    //Esse terceiro código é basicamente o mesmo acima, mas sem o Break, imprimindo todas as respostas a partir do argumeto correto chamado.
    public static void main(String[] args) {
        
        // Declara uma variável String para armazenar a sigla
        String sigla = "M";

        // Utiliza a instrução switch para avaliar a sigla e executar o bloco correspondente
        switch (sigla) {
            
            // Caso a sigla seja "T"
            case "T": {
            System.out.println("5Gb para Youtube");
            }
            // Caso a sigla seja "M"
            case "M": {
            System.out.println("Whatsapp e Intagram grátis");
            }
            // Caso a sigla seja "B"
            case "B": {
            System.out.println("100 minutos de ligação");
            break; // Coloquei para encerra o switch caso de fato use uma sigla correta. B, M ou T.
            }
            // Caso a sigla não corresponda a nenhum dos casos anteriores
            default: {
            System.out.println("Indefinido");
            }
        }
    }
}
