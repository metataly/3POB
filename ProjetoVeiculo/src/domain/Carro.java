package domain;

public class Carro extends Veiculo{

    private int qtdPortas;

    @Override
    public void exibirDados() {
        System.out.println("Veículo: Carro");
        super.exibirDados();
        System.out.println("qtdPortas " +qtdPortas);
    }

    public Carro(String placa, String modelo, int ano, int qtdPortas) {
        super(placa, modelo, ano);
        this.qtdPortas = qtdPortas;
    }

    //getters e setters
    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

}
