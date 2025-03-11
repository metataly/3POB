/*Média de notas de uma turma

Descrição:
Desenvolva um programa que calcule a média das notas de uma turma, onde
o usuário informe quantos alunos há na turma e suas respectivas notas.
Requisitos:
• O programa deve solicitar a quantidade de alunos.
• Deve utilizar um loop for para receber as notas de cada aluno.
• Utilizar um acumulador para somar todas as notas.
• No final, exibir a média da turma.*/

package fase01.Lista3.L3E4;

import java.util.Scanner;

public class MediaNotas {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a quantidade de alunos:");
        int qtdAlunos = scan.nextInt();

        double somaNotas = 0.0;

        for (int i=1; i<=qtdAlunos; i++){
            System.out.println("Digite a nota: ");
            double nota = scan.nextDouble();

            somaNotas += nota;
        }

        double media = somaNotas/qtdAlunos;

        System.out.println("A media das notas dos alunos eh: " +media);

        scan.close();
    }
}
