package interfaces.Ex03.domain;

import interfaces.Ex03.interface.Dispositivo;

public class Smartphone implements Dispositivo{
    
    public void ligar(){
        System.out.println("Smartphone ligado!");
    }

    public void desligar(){
        System.out.println("Smartphone desligado!");
    }
}
