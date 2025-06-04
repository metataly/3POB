package interfaces.Ex03.controller;

import java.util.Scanner;
import interfaces.Ex03.domain.*;

public class DispositivoController {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Dispositivo dispositivo;

        System.out.println("Qual dispositivo deseja utilizar? [1] Smartphone | [2] Televisão");
        int op = scan.nextInt();

        if(op == 1){
            dispositivo = new Smartphone();
        } else if(op == 2){
            dispositivo = new Televisao();
        } else {
            System.out.println("Opção inválida!");
            scan.close();
            return;
        }

        System.out.println("Deseja ligar ou desligar? [1] Ligar | [2] Desligar");
        int funcao = scan.nextInt();

        if(funcao == 1){
            dispositivo.ligar();
        } else if(funcao == 2){
            dispositivo.desligar();
        } else {
            System.out.println("Opção inválida!");
        }

        scan.close();
    }
}
