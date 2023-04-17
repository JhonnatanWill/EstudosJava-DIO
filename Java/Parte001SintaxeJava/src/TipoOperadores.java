package Parte001SintaxeJava.src;

public class TipoOperadores {
    
    public static void main(String [] args) throws Exception{
    
    // Operadores de atribuição.
    /*
    String nome = "Jhonnatan";
    int idade = 27;
    double peso = 66.3;
    char sexo = 'M'; //Tipo char, só aceita um caractere para atribuir o valor.
    boolean doadorOrgao = false;
    Date dataNascimento = new Date ();
    */

    // Operador artimético
    /*
    double soma = 13.5 + 7.5;
    int subtração = 46 - 25;
    int multiplicação = 3 * 7;
    int divisão = 63 / 3;
    int módulo = 300 % 7;
    double resultado = (3 * 4) + (63 / 7);
    */

    String nomeCompleto = "Jhonnatan" + "Will";
    System.out.println(nomeCompleto);

    int numero = 5;
    // x repetição
    numero = numero + 1;
    System.out.println(numero);

    //numero = --numero; //Usando esse -- antes da variável, ela é diminuita em 1.
    System.out.println(numero);
    System.out.println(-- numero);

    boolean variavel = true;
    variavel = !variavel; // Usa o ! para negar o valor booleano da vareável e inverte-lo.
    System.out.println(variavel);

    int a, b;
    a = 5 ;
    b = 5;

    /*
    String resultado = "";
    if(a==b)
        resultado = "verdadeiro";
    else
        resultado = "falso";
    System.out.println(resultado);
    */
    
    String resultado = a==b ? "verdadeiro" : "falso";
    System.out.println(resultado);

    int numero1 = 1;
    int numero2 = 2;
    boolean simNao = numero1 == numero2;
    System.out.println("numeroUm é igual a numeroDois? " + simNao);

    simNao = numero1 != numero2;
    System.out.println("numeroUm é diferente a numeroDois? " + simNao);

    simNao = numero1 == --numero2;
    System.out.println("numeroUm é igual a numeroDois? " + simNao);

    int numero01 = 1;
    int numero02 = 2;
    if(numero01 < numero02){
        System.out.println("A nossa condição é verdadeira!");}
    else{
        System.out.println("A nossa condição é Falsa!");
    }

    boolean condição1=true;
    boolean condição2=false;

    if(condição1 && condição2){
        System.out.println("As duas condições são verdadeiras!");
    }

    if(condição1 || condição2)
        System.out.println("Uma das condições e verdadeira!");
    }
}
