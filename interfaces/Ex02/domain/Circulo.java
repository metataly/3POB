package interfaces.Ex02.domain;

import interfaces.Ex02.interface.FormaGeometrica;
import interfaces.Ex02.interface.FormaGeometrica;

public class Circulo implements FormaGeometrica{
    
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public void calcularPerimetro(){
        System.out.println("O Perímetro do circulo é: "+ (2*3.14*raio));
    }
     public void calcularArea() {

        System.out.println("A área do circulo é: "+ (3.14*(raio*raio));
    }

}
