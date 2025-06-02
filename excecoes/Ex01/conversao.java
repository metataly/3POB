package excecoes.Ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scan.nextDouble();

            double fahrenheit = (celsius * 9/5) + 32;
            System.out.printf("A temperatura em Fahrenheit é: %.2f°F\n", fahrenheit);

        } catch (NumberFormatException e) {
            System.out.println("Erro: Valor inválido. Digite um número válido.");
        }

        scan.close();
        
    }
}

