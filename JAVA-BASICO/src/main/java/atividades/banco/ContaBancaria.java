package atividades.banco;

public class ContaBancaria {
    private  String nome;
    private  int agencia;
    private  double numeroDaConta;
    private  String tipoDaConta;
    private  double saldoAtual;
    private  String limiteDisponivel;

    public ContaBancaria(String nome, int agencia, double numeroDaConta, String tipoDaConta, double saldoAtual, String limiteDisponivel) {
        this.nome = nome;
        this.agencia = agencia;
        this.numeroDaConta = numeroDaConta;
        this.tipoDaConta = tipoDaConta;
        this.saldoAtual = saldoAtual;
        this.limiteDisponivel = limiteDisponivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(double numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTipoDaConta() {
        return tipoDaConta;
    }

    public void setTipoDaConta(String tipoDaConta) {
        this.tipoDaConta = tipoDaConta;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public String getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(String limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nome='" + nome + '\'' +
                ", agencia=" + agencia +
                ", numeroDaConta=" + numeroDaConta +
                ", tipoDaConta='" + tipoDaConta + '\'' +
                ", saldoAtual=" + saldoAtual +
                ", limiteDisponivel='" + limiteDisponivel + '\'' +
                '}';
    }
}
