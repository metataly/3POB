package fase01.ExClasse.ExPessoa.Controle;

import java.util.Scanner;
import fase01.ExClasse.ExPessoa.Dominio.Pessoa;

public class ControlePessoa {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();

        System.out.print("Digite o peso: ");
        double peso = sc.nextDouble();

        System.out.print("Digite o sexo: ");
        char sexo = sc.next().charAt(0);

        Pessoa pessoa = new Pessoa(nome,idade,altura,peso,sexo);

        System.out.println("\nDados da pessoa:");
        pessoa.listarPessoa();

        System.out.println("IMC da pessoa: "+pessoa.calcularIMC());
        System.out.print("Classificação do IMC da pessoa: "+pessoa.classificarIMC());

        sc.close(); 
    }
}
