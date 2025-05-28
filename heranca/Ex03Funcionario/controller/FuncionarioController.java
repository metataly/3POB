package heranca.Ex03Funcionario.controller;
import heranca.Ex03Funcionario.entity.*;

public class FuncionarioController {
    public static void main(String[] args) {

        Funcionario func = new Funcionario("Maria", 2000);
        Gerente gerente = new Gerente("Luiz", 4000);
        Estagiario estag = new Estagiario("Luana", 1000);

        System.out.println("nome:" + func.getNome() + "salario:" + func.getSalarioBase());
        System.out.println("nome:" + gerente.getNome() + "salario:" + gerente.getSalarioBase());
        System.out.println("nome:" + estag.getNome() + "salario:" + estag.getSalarioBase());

    }
}
