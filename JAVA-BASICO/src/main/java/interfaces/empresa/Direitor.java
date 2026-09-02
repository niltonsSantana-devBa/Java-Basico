package interfaces.empresa;

public class Direitor extends Funcionario implements Contratacao{
    private final double PREMIO = 1.2;

    public Direitor(String nome, String dataDeNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataDeNascimento, sexo, setor, salarioBase);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public double getSalarioFinal() {
        return super.salarioBase  * this.PREMIO;

    }

    @Override
    public String toString() {
        return "Direitor{" +
                "PREMIO=" + PREMIO +
                ", nome='" + nome + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salarioBase=" + salarioBase +
                ", Salario Final: " + this.getSalarioFinal() +
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
