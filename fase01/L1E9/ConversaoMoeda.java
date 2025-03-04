 /*Faça um programa que leia um valor em reais (R$) e a cotação do dólar no dia. 
 O programa deve calcular e exibir o valor equivalente em dólares (US$). */

package fase01.L1E9;

import java.util.Scanner;

public class ConversaoMoeda {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor em R$: ");
        float real = scan.nextFloat();
        
        System.out.print("Informe a cotação do dólar: ");
        float dolar = scan.nextFloat();

        System.out.print("R$ " + real + " na cotação atual do dólar, equivale a: $" + (real/dolar));
        scan.close();
    }
}
