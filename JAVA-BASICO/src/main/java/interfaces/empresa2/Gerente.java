package interfaces.empresa2;

import interfaces.empresa.Funcionario;

public class Gerente extends CargoDeConfianca implements Contratacao{
    public Gerente(String nome, String cpf, String dataNascimento, double salarioBase) {
        super(nome, cpf, dataNascimento, salarioBase);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitir: " + funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitir: " + funcionario.toString());
    }

}
