package interfaces.empresa2;

public  abstract class CargoDeConfianca extends Funcionario {
    protected Bonificacao bonificacao;


    public CargoDeConfianca(String nome, String cpf, String dataNascimento, double salarioBase) {
        super(nome, cpf, dataNascimento, salarioBase);
    }
}
