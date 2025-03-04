/*Cálculo do Salário
Escreva um programa que receba o salário bruto de um funcionário 
e o valor de desconto do INSS. O programa deve calcular e exibir o salário líquido.*/

package fase01.L1E6;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o seu salário: ");
        double salario = scan.nextDouble();

        double desconto = 0;

        if(salario <= 1.518) {
            desconto = salario*0.075;
        } else {
            if(salario <= 2793.88) {
                desconto = salario*0.09;
            } else {
                if(salario <= 4190.83) {
                    desconto = salario*0.12;
                } else {
                    if(salario <= 8157.41) {
                        desconto = salario*0.14;
                    }
                }
            }
        }
        System.out.print("O salario líquido após o desconto é R$ " + (salario-desconto));
        scan.close();
    }    
}
