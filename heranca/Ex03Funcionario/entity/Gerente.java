package heranca.Ex03Funcionario.entity;
import heranca.Ex03Funcionario.entity.Funcionario;

public class Gerente extends Funcionario{
    
    public Gerente(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario(){
        return salarioBase + (salarioBase * 5/100);
    }
}
