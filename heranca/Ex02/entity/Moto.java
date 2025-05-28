import heranca.Ex02.entity.Veiculo;

public class Moto extends Veiculo{

    private boolean eletrica;


    public Moto(String marca, int ano, boolean eletrica) {
        super(marca, ano);
        this.eletrica = eletrica;
    }

    // Métodos Getters e Setters
    public boolean getEletrica() {
        return eletrica;
    }

    public void setEletrica(boolean eletrica) {
        this.eletrica = eletrica;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Elétrica: " + (eletrica ? "Sim" : "Não"));
    }
} 