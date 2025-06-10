package domain;

public class Caminhao extends Veiculo {
    private double carga;

    @Override
    public void exibirDados() {
        System.out.println("Veículo: Caminhão");
        super.exibirDados();
        System.out.println("Capacidade Carga " +carga+ "kg");
    }

    public Caminhao(String placa, String modelo, int ano, double carga) {
        super(placa, modelo, ano);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

}
