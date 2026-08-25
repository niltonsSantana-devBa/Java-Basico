package atividades.veiculo;

public class Veiculo {
    private String placa;
    private String cor;
    private int numeroDePassageiro;
    private int capacidadeDoTanque;
    private int velocidadeMaxima;
    private double consumoMedio;

    public Veiculo(String placa, String cor, int numeroDePassageiro, int capacidadeDoTanque, int velocidadeMaxima, double consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        this.numeroDePassageiro = numeroDePassageiro;
        this.capacidadeDoTanque = capacidadeDoTanque;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumoMedio = consumoMedio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroDePassageiro() {
        return numeroDePassageiro;
    }

    public void setNumeroDePassageiro(int numeroDePassageiro) {
        this.numeroDePassageiro = numeroDePassageiro;
    }

    public int getCapacidadeDoTanque() {
        return capacidadeDoTanque;
    }

    public void setCapacidadeDoTanque(int capacidadeDoTanque) {
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", numeroDePassageiro=" + numeroDePassageiro +
                ", capacidadeDoTanque=" + capacidadeDoTanque +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", consumoMedio=" + consumoMedio +
                '}';
    }
}
