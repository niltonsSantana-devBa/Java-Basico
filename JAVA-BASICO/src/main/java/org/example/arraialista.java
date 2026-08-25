package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class arraialista {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        String resposta;

        do {
            System.out.println("Digite uma nota: ");
            notas.add(ler.nextDouble());

            System.out.println("Deseja inserir mais nota?");
            System.out.println("\nPressione a tecla N para sair. ");
            resposta = ler.next();
        } while (!resposta.equalsIgnoreCase("n"));

        System.out.println("\nExibindo as notas:");
        double soma = 0;

        for (double nota : notas) {
            System.out.println("Nota: " + nota);
            soma += nota; // Acumula o valor de cada nota
        }

        // Garante que não haverá divisão por zero caso a lista esteja vazia
        if (!notas.isEmpty()) {
            double media = soma / notas.size();
            System.out.printf("\nMédia das notas: %.2f\n", media);
        } else {
            System.out.println("\nNenhuma nota foi inserida.");
        }

        ler.close();
    }
}