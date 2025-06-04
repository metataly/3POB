package interfaces.Ex03.domain;

import interfaces.Ex03.interface.Dispositivo;

public class Televisao implements Dispositivo{
    
    public void ligar(){
        System.out.println("Televisão ligada!");
    }

    public void desligar(){
        System.out.println("Televisão desligada!");
    }
}
