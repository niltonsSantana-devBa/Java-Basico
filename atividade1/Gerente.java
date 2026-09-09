package atividade1;

public class Gerente extends CargoDeConfianca {
    public Gerente(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao) {
        super(nome, cpf, rg, sexo, salarioBase, dataNascimento, dataAdmissao, Bonificacao.GERENTE);
    }

    @Override
    public double getSalarioFinal() {
        return super.salarioBase * this.bonificacao.getValor();
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", sexo=" + sexo +
                ", salarioBase=" + salarioBase +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                ", Salário Final: " + getSalarioFinal() +
                '}';
    }
}