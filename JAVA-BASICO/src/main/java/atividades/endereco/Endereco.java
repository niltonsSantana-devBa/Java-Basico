package atividades.endereco;

public class Endereco {
    private String lagradouro;
    private int numero;
    private String cidade;

    public Endereco(String lagradouro, int numero, String cidade) {
        this.lagradouro = lagradouro;
        this.numero = numero;
        this.cidade = cidade;
    }

    public String getLagradouro() {
        return lagradouro;
    }

    public void setLagradouro(String lagradouro) {
        this.lagradouro = lagradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "lagradouro='" + lagradouro + '\'' +
                ", numero=" + numero +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
