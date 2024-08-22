package Parte001SintaxeJava.src;

public class Projeto001SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(){
        //volume = volume + 1;
        ++volume;
    }

    public void diminuirVolume(){
        --volume;
    }

    public void próximoCanal(){
        canal = canal + 1;
    }

    public void anteriorCanal(){
        canal = canal - 1;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

}
