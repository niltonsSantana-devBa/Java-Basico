package atividades.veiculo;

import poo.Biblioteca;

public class Main {
    static void main() {
        Livros livro = new Livros("Harry poter" , "Alice " , "9788532511010" , 90, 100.5);
        Veiculo veiculo = new Veiculo("ABC1D23", "Vermelha", 5,50, 220,8.7);

        System.out.println(livro);
        System.out.println(veiculo);
    }
}
