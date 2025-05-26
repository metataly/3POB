
public class Aluno {
    private int matricula;
    private String nome;
    private double coeficienteRendimento;

    public Produto(int matricula, String nome, double coeficienteRendimento) {
        this.matricula = matricula;
        this.nome = nome;
        this.coeficienteRendimento = coeficienteRendimento;
    }

    public int getmatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return coeficienteRendimento;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double coeficienteRendimento) {
        this.coeficienteRendimento = coeficienteRendimento;
    }

    public void listarProduto() {
        System.out.println("Matricula: " + matricula + ", Nome: " + nome + ", CR: " + coeficienteRendimento);
    }
}