package atividades.banco;

import atividades.endereco.Endereco;

public class Funcionario {
    private String nome;
    private Sexo sexo;
    private int codigoDoFuncionario;
    private Endereco endereco;
    private String telefone;
    private String email;
    private ContaBancaria contaBancaria;
    private Associado associado;
    private Setor setor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public int getCodigoDoFuncionario() {
        return codigoDoFuncionario;
    }

    public void setCodigoDoFuncionario(int codigoDoFuncionario) {
        this.codigoDoFuncionario = codigoDoFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContaBancaria getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    public Associado getAssociado() {
        return associado;
    }

    public void setAssociado(Associado associado) {
        this.associado = associado;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Funcionario(String nome, Sexo sexo, int codigoDoFuncionario, Endereco endereco, String telefone, String email, ContaBancaria contaBancaria, Associado associado, Setor setor) {
        this.nome = nome;
        this.sexo = sexo;
        this.codigoDoFuncionario = codigoDoFuncionario;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.contaBancaria = contaBancaria;
        this.associado = associado;
        this.setor = setor;

    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", sexo=" + sexo +
                ", codigoDoFuncionario=" + codigoDoFuncionario +
                ", endereco=" + endereco +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", contaBancaria=" + contaBancaria +
                ", associado=" + associado +
                ", setor=" + setor +
                '}';
    }
}
