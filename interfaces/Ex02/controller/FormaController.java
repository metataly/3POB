import java.util.Scanner;

public class FormaController {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("==== Retângulo ====");
        System.out.print("Informe a largura: ");
        double largura = scan.nextDouble();

        System.out.print("Informe a altura: ");
        double altura = scan.nextDouble();

        Retangulo retangulo = new Retangulo(largura, altura);

        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do Retângulo: " + retangulo.calcularPerimetro());


        System.out.println("\n==== Círculo ====");
        System.out.print("Informe o raio: ");
        double raio = scan.nextDouble();

        Circulo circulo = new Circulo(raio);

        System.out.println("Área do Círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do Círculo: " + circulo.calcularPerimetro());

        scan.close();
    }
}
