package atividade1;

public class Main {
    public static void main(String[] args) {

        // 1. Criando um Motoboy
        Motoboy motoboy = new Motoboy(
                "Carlos Silva",
                "111.222.333-44",
                "1234567",
                Sexo.MASCULINO,
                2000.0,
                "10/05/1995",
                "01/02/2022",
                "ABC-1234"
        );

        // 2. Criando um Gerente
        Gerente gerente = new Gerente(
                "Ana Souza",
                "555.666.777-88",
                "7654321",
                Sexo.FEMININO,
                5000.0,
                "15/08/1990",
                "10/01/2020"
        );

        // 3. Criando um Diretor
        Diretor diretor = new Diretor(
                "Roberto Lima",
                "999.888.777-66",
                "9876543",
                Sexo.MASCULINO,
                10000.0,
                "20/12/1980",
                "05/05/2015"
        );

        // Exibindo os dados e testando os cálculos de salário
        System.out.println("--- MOTOBOY ---");
        System.out.println(motoboy);

        System.out.println("\n--- GERENTE ---");
        System.out.println(gerente);

        System.out.println("\n--- DIRETOR ---");
        System.out.println(diretor);

        // Testando os métodos da interface Contratacao
        System.out.println("\n--- AÇÕES DO DIRETOR ---");
        diretor.admitir(motoboy);
        diretor.demitir(gerente);
    }
}