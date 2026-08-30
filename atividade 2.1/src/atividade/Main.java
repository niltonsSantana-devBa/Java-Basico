package atividade;

public class Main {
    static void main() {
        Endereco endEngenheiro = new Endereco(
                "Rua das Flores",
                "123",
                "Apto 101",
                "40000-000",
                "Salvador"
        );

        Endereco endMedico = new Endereco(
                "Avenida Brasil",
                "500",
                "Bloco B",
                "41000-111",
                "Lauro de Freitas"
        );

        Engenheiro eng = new Engenheiro(
                "Carlos Silva",
                "carlos.silva@email.com",
                8500.00f,
                endEngenheiro,
                "123456789-BA"
        );
        Medico med = new Medico(
                "Dra. Ana Costa",
                "ana.costa@email.com",
                12000.00f,
                endMedico,
                "98765-BA"
        );

        System.out.println("=== DADOS DO ENGENHEIRO ===");
        System.out.println(eng);
        System.out.println("\n-----------------------------------\n");
        System.out.println("=== DADOS DO MÉDICO ===");
        System.out.println(med);



    }
}
