package Parte001SintaxeJava.src;

public class Projeto001Usuario {
    
    public static void main(String[] args) throws Exception {
        
        Projeto001SmartTV Projeto001SmartTV = new Projeto001SmartTV();

        System.out.println("TV ligada? " + Projeto001SmartTV.ligada);
        
        Projeto001SmartTV.ligar ();
        System.out.println("Novo status -> TV ligada: " + Projeto001SmartTV.ligada);
        
        System.out.println("Canal atual: " + Projeto001SmartTV.canal);
        System.out.println("Volume inicial: " + Projeto001SmartTV.volume);

        Projeto001SmartTV.aumentarVolume();
        System.out.println("Aumentando o volume para: " + Projeto001SmartTV.volume);

        Projeto001SmartTV.próximoCanal();
        System.out.println("Canal atual: " + Projeto001SmartTV.canal);

        Projeto001SmartTV.mudarCanal(22);
        System.out.println("Canal atual: " + Projeto001SmartTV.canal);
        
        Projeto001SmartTV.anteriorCanal();
        System.out.println("Canal atual: " + Projeto001SmartTV.canal);

        Projeto001SmartTV.diminuirVolume();
        System.out.println("Diminuindo o volume para: " + Projeto001SmartTV.volume);

        Projeto001SmartTV.desligar ();
        System.out.println("Novo status -> TV ligada: " + Projeto001SmartTV.ligada);

    }
}
