package Modulo1;

import java.util.Scanner;

public class ComandaRestaurante {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double total = 0.0;
        char continuar;

        do {
            exibirMenu();
            System.out.print("Informe o prato desejado: ");
            int codigo = leitor.nextInt();

            double preco = obterPreco(codigo);
            if (preco > 0) {
                total += preco;
                System.out.println("Item adicionado com sucesso!");
            } else {
                System.out.println("Tente novamente.");
            }

            System.out.print("Gostaria de adicionar outro prato? (S/N): ");
            continuar = leitor.next().toUpperCase().charAt(0);

        } while (continuar == 'S');

        System.out.printf("%n=== RESUMO DO PEDIDO ===%n");
        System.out.printf("Total a pagar: R$ %.2f%n", total);
        System.out.println("Obrigado pela preferência!");

        leitor.close();
    }

    private static void exibirMenu() {
        System.out.println("\n--- CARDÁPIO ---");
        System.out.println("1 | Picanha        - R$ 25,00");
        System.out.println("2 | Lasanha        - R$ 20,00");
        System.out.println("3 | Strogonoff     - R$ 18,00");
        System.out.println("4 | Bife acebolado - R$ 15,00");
        System.out.println("5 | Pão com ovo    - R$ 5,00");
    }

    private static double obterPreco(int codigo) {
        return switch (codigo) {
            case 1 -> 25.00;
            case 2 -> 20.00;
            case 3 -> 18.00;
            case 4 -> 15.00;
            case 5 -> 5.00;
            default -> -1.0;
        };
    }
}