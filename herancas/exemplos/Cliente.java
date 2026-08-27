package herancas.exemplos;

public class Cliente  extends Pessoas{
    private String dataDeCompra;
    private String formaDePagamento;
    private String cpf;
    private String rg;
    private String dataNascimento;

    public Cliente(String nome, int idade, String telefone, String dataDeCompra, String formaDePagamento, String cpf, String rg, String dataNascimento) {
        super(nome, idade, telefone);
        this.dataDeCompra = dataDeCompra;
        this.formaDePagamento = formaDePagamento;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;

    }

    public String getDataDeCompra() {
        return dataDeCompra;
    }

    public void setDataDeCompra(String dataDeCompra) {
        this.dataDeCompra = dataDeCompra;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dataDeCompra='" + dataDeCompra + '\'' +
                ", formaDePagamento='" + formaDePagamento + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
