package domain;

public class Moto extends Veiculo {

    private int cilindradas;

    @Override
    public void exibirDados() {
        System.out.println("Veículo: Moto");
        super.exibirDados();
        System.out.println("Cilindradas " +cilindradas+ "cc");
    }

    public Moto(String placa, String modelo, int ano, int cilindradas) {
        super(placa, modelo, ano);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

}
