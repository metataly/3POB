import heranca.Ex02.entity.Veiculo;

public class Carro extends Veiculo{

    private int numPortas;


    public Carro(String marca, int ano, int numPortas) {
        super(marca, ano);
        this.numPortas = numPortas;
    }

    // Métodos Getters e Setters
    public String getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Qtd Portas: " + numPortas);
    }
} 