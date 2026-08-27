package herancas.exemplos;

public class Funcionario extends Pessoas{
    private String matricula;
    private String cargo;
    private String salario;
    private String  cnpj;
    private String  inscricaoEstadudal;


    public Funcionario(String nome, int idade, String telefone, String matricula, String cargo, String salario, String cnpj, String inscricaoEstadudal) {
        super(nome, idade, telefone);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
        this.cnpj = cnpj;
        this.inscricaoEstadudal = inscricaoEstadudal;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadudal() {
        return inscricaoEstadudal;
    }

    public void setInscricaoEstadudal(String inscricaoEstadudal) {
        this.inscricaoEstadudal = inscricaoEstadudal;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "matricula='" + matricula + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario='" + salario + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", inscricaoEstadudal='" + inscricaoEstadudal + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
