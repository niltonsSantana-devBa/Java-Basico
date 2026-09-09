package atividade1;

public class Diretor extends CargoDeConfianca implements Contratacao {

    private static final double PREMIO = 1.1;

    public Diretor(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao) {
        super(nome, cpf, rg, sexo, salarioBase, dataNascimento, dataAdmissao, Bonificacao.DIRETOR);
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("O funcionário " + funcionario.getNome() + " foi admitido.");
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("O funcionário " + funcionario.getNome() + " foi demitido.");
    }

    @Override
    public double getSalarioFinal() {
        return (super.salarioBase * this.bonificacao.getValor()) * PREMIO;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", sexo=" + sexo +
                ", salarioBase=" + salarioBase +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                ", Prêmio: " + PREMIO +
                ", Salário Final: " + getSalarioFinal() +
                '}';
    }
}