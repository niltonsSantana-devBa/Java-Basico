package org.example;

import java.util.Scanner;

public class Arrai {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] notas = new double[2];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            boolean notaValida = false;

            // O loop repete até o usuário digitar uma nota válida
            while (!notaValida) {
                System.out.println("Digite a " + (i + 1) + "ª nota (0 a 10):");
                double notaEscrita = ler.nextDouble();

                // Se a nota estiver FORA do intervalo de 0 a 10
                if (notaEscrita < 0 || notaEscrita > 10) {
                    System.out.println("ERRO!! Digite a nota entre 0 a 10.");
                } else {
                    // Nota válida: salva no array e encerra o while para este aluno
                    notas[i] = notaEscrita;
                    notaValida = true;
                }
            }
        }

        System.out.println("\nExibindo as notas:");
        for (double nota : notas) {
            System.out.println("Nota: " + nota);
            soma += nota; // Soma feita apenas uma vez aqui no foreach
        }

        double media = soma / notas.length;
        System.out.printf("%nMédia aritmética: %.2f%n", media);

        ler.close();
    }
}