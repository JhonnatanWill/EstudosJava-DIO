package Projeto001AulasSintaxeJava.src;

public class MinhaClasse {
    
    public static void main (String [] args) {
        System.out.print ( "Olá, meu nome é Jhonnatan Will!");
        
        String primeiroNome = "Jhonnatan";
        String segundoNome = "Willian";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeironNome, String segundoNome){
        return "Resultado do método " + primeironNome.concat(" ").concat(segundoNome);
    }
}
