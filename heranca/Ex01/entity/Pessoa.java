public class Pessoa{
    protected String nome;
    protected int idade;


    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String exibirDados() {
        return "Nome: " + nome + "\n idade: " +idade;
    }
}
