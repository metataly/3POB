import heranca.Ex01.entity.Pessoa;

public class Professor extends Pessoa{

    private double salario;
    

    public Professor(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    // Métodos Getters e Setters
    public String getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Salario " + salario);
    }
} 