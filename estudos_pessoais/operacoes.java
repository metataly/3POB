/*  Questão genérica para validar conhecimentos e revisão de aula
    O código visa coletar dois numeros inseridos pelo usuário
    e fazer a média dos valores do intevarlo digitado.

    !Comentários feitos pelo GPT para melhor entendimento!
 */

// Pacote onde o código está localizado
package estudos_pessoais;

// Importação da classe Scanner para capturar entrada do usuário
import java.util.Scanner;

// Classe principal chamada "operacoes"
public class operacoes {
    public static void main(String[] args) {
        // Criando um Scanner para entrada de dados do usuário
        Scanner scan = new Scanner(System.in);

        // Declaração de variáveis
        int numero1, numero2, soma = 0, cont = 0; // Variáveis inteiras
        float media; // Variável float para armazenar a média

        // Solicita ao usuário que insira o primeiro número
        System.out.println("Digite um numero: ");
        numero1 = scan.nextInt(); // Lê um número inteiro do teclado

        // Solicita ao usuário que insira o segundo número
        System.out.println("Digite o segundo numero: ");
        numero2 = scan.nextInt(); // Lê outro número inteiro do teclado

        // Laço de repetição que percorre os números entre numero1 e numero2 (inclusive)
        for (int i = numero1; i <= numero2; i++) {
            soma += i; // Soma os valores do intervalo
            cont++;    // Conta quantos números foram somados

            // Imprime os números do intervalo na tela
            System.out.print(i + " , ");
        }
        System.out.println(" "); // Pula para a próxima linha

        // Calcula a média convertendo soma para float antes da divisão para evitar erro de arredondamento
        media = (float) soma / cont;

        // Exibe o resultado da média
        System.out.println("A média dos números " + numero1 + ", " + numero2 + " é: " + media);

        // Fecha o Scanner para evitar vazamento de recursos
        scan.close();
    }
}

