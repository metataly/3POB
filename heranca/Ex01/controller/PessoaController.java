package heranca.Ex01.controller;

import heranca.Ex01.entity.Pessoa;
import heranca.Ex01.entity.Aluno;
import heranca.Ex01.entity.Professor;


public class PessoaController {
   public static void main(String[] args) {

        Pessoa p = new Pessoa("João", 40);
        Aluno a = new Aluno("Maria", 20, "Engenharia");
        Professor prof = new Professor("Lucas", 30, 5000);

        p.exibirDados();
        a.exibirDados();
        prof.exibirDados(); 
    }
}
