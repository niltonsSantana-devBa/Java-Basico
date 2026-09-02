package interfaces.empresa;

public enum Setor {
    RECURSOS_HUMANOS("Recursos humanos"),
    FINANCEIRO("Financeiro"),
    OPERACOES("Operação");

    private String nome;

    Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
