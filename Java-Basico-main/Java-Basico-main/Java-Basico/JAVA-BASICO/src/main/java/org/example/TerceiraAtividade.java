package org.example;

public class TerceiraAtividade {
    static void main() {
        double notaAluno = 6.5;
        double nota2Aluno = 7.8;


        double nota = (notaAluno + nota2Aluno) / 2;

        if (nota >= 7) {
            System.out.println("Aluno aprovado");
        } else if (nota >= 5) {
            System.out.println("Aluno verificação suplementar");

        } else {
            System.out.println("Aluno reprovado");

        }
    }
}
