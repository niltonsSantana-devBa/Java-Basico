package org.example;

import java.util.Scanner;

public class While {
    static void main() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua idade");
        double idade = ler.nextInt();

        while (idade < 18){
            System.out.println("Acesso negado");
            System.out.println("Digite sua idade");
            idade = ler.nextInt();
        }
        System.out.println("Acesso permitido");
        System.out.println("Carregando...");
    }
}
