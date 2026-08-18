package org.example;

import java.sql.Array;
import java.util.ArrayList;

public class arraialista {
    static void main() {
        ArrayList <Double> notas = new ArrayList <>();
        String resposta;
        do {
            System.out.println("Digite uma nota: ");
            notas.add(ler.nexDouble());
            System.out.println("Deseja inserir mais nota?");
            System.out.println("\nPressione a tecla N para sair. ");
            resposta = ler.next();
        }while (!resposta.equalsIgnoreCase("n"));

        System.out.println("\nExibindo as notas:");
        for(doublenota: notas)
            System.out.println("Nota:" +nota);
       
        }
    }
}
