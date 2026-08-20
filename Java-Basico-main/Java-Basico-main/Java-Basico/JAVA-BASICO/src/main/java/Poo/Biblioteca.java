package Poo;

public class Biblioteca {
    private String titulo;
    private String Autor;
    int numeroPagina;
    double preco;

    public Biblioteca(String titulo, String autor, int numeroPagina, double preco) {
        this.titulo = titulo;
        Autor = autor;
        this.numeroPagina = numeroPagina;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getNumeroPagina() {
        return numeroPagina;
    }

    public void setNumeroPagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
