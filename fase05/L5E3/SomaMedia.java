package fase05.L5E3;

import java.util.ArrayList;
import java.util.Scanner;

public class SomaMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Double> numeros = new ArrayList<>();

        double soma = 0;
        while (true) {
            System.out.print("Digite um número (-1 para sair): ");
            double num = scan.nextDouble();

            if (num == -1) {
                break;
            }

            numeros.add(num);
            soma += num;
        }

        double media = soma/numeros.size();
        System.out.print("A média dos valores inseridos eh: " + media);
      
        scan.close();
    }
}

