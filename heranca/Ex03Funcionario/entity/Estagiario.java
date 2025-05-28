package heranca.Ex03Funcionario.entity;
import heranca.Ex03Funcionario.entity.Funcionario;

public class Estagiario extends Funcionario{
        
    public Estagiario (String nome, double salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario(){
        return salarioBase + (salarioBase * 20/100);
    }
}
