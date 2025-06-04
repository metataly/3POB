package interfaces.Ex02.domain;

import interfaces.Ex02.interface.FormaGeometrica;

import interfaces.Ex02.interface.FormaGeometrica;

public class Retangulo implements FormaGeometrica {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public void calcularArea() {
        System.out.println("A Área do retangulo é: "+ (largura * altura));
    }

    public void calcularPerimetro() {
        System.out.println("O Perímetro do retangulo é: "+ (2 * (largura + altura)));
    }
}

}
