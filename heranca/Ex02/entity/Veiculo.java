public abstract class Veiculo{
    protected String marca;
    protected int ano;


    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    // Métodos Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String exibirDados() {
        return "marca: " + marca + "\n ano: " +ano;
    }
}