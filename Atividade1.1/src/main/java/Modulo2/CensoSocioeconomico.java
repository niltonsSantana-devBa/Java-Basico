package Modulo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CensoSocioeconomico {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Pessoa> habitantes = new ArrayList<>();
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n1 | Adicionar pessoa");
            System.out.println("2 | Exibir resultados");
            System.out.println("3 | Sair");
            System.out.print("> Escolha uma opção: ");

            if (leitor.hasNextInt()) {
                opcao = leitor.nextInt();
            } else {
                System.out.println("Opção inválida! Digite um número.");
                leitor.next();
                continue;
            }

            if (opcao == 1) {
                System.out.print("> Idade: ");
                int idade = leitor.nextInt();

                System.out.print("> Sexo (M/F): ");
                char sexo = leitor.next().toUpperCase().charAt(0);

                System.out.print("> Salário: ");
                double salario = leitor.nextDouble();

                habitantes.add(new Pessoa(idade, sexo, salario));
                System.out.println("> Registro incluído. Retornando ao menu...");

            } else if (opcao == 2) {
                if (habitantes.isEmpty()) {
                    System.out.println("\nNenhuma pessoa cadastrada até o momento.");
                } else {
                    double somaSalarios = 0;
                    int maiorIdade = habitantes.get(0).idade;
                    int menorIdade = habitantes.get(0).idade;
                    int mulheresSalarioAlto = 0;

                    for (Pessoa p : habitantes) {
                        somaSalarios += p.salario;

                        if (p.idade > maiorIdade) maiorIdade = p.idade;
                        if (p.idade < menorIdade) menorIdade = p.idade;

                        if (p.sexo == 'F' && p.salario >= 5000.0) {
                            mulheresSalarioAlto++;
                        }
                    }

                    double mediaSalarial = somaSalarios / habitantes.size();

                    System.out.println("\n=== RESULTADOS ESTATÍSTICOS ===");
                    System.out.printf("• Média salarial do grupo: R$ %.2f%n", mediaSalarial);
                    System.out.println("• Maior idade registrada: " + maiorIdade);
                    System.out.println("• Menor idade registrada: " + menorIdade);
                    System.out.println("• Mulheres com salário ≥ R$ 5.000,00: " + mulheresSalarioAlto);
                }

            } else if (opcao == 3) {
                System.out.println("\nEncerrando o programa...");
            } else {
                System.out.println("Opção inválida! Escolha 1, 2 ou 3.");
            }
        }

        leitor.close();
    }
}