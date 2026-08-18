package org.example;

import java.sql.Array;
import java.util.ArrayList;

public class Arrailist {
    static void main() {
        ArrayList <Double> notas = new ArrayList <>();

        notas.add(10.0);
        notas.add(8.0);

        for (double nota: notas){
            System.out.println("Nota:" + nota );
        }
    }
}
