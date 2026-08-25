package atividades.veiculo;

public class Livros {
    private String titulo;
    private String autor;
    private String isbn;
    private int numeroDePagina;
    private double valorDeCompra;

    public Livros(String titulo, String autor, String isbn, int numeroDePagina, double valorDeCompra) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numeroDePagina = numeroDePagina;
        this.valorDeCompra = valorDeCompra;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumeroDePagina() {
        return numeroDePagina;
    }

    public void setNumeroDePagina(int numeroDePagina) {
        this.numeroDePagina = numeroDePagina;
    }

    public double getValorDeCompra() {
        return valorDeCompra;
    }

    public void setValorDeCompra(double valorDeCompra) {
        this.valorDeCompra = valorDeCompra;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", numeroDePagina=" + numeroDePagina +
                ", valorDeCompra=" + valorDeCompra +
                '}';
    }
}
