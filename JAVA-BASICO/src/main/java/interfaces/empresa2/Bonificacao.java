package interfaces.empresa2;

public enum Bonificacao {
    GERENTE(1.3),
    DIREITOR(1.4);

    private double valor;

    Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
