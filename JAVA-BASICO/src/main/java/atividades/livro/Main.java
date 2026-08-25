package atividades.livro;

import poo.Biblioteca;

public class Main {
    static void main() {

        Biblioteca livro1 = new Biblioteca("Harry poter" , "Alice " , 73 , 500.99);
        Biblioteca livro2 = new Biblioteca("Diario de um banna" , "Mauricio " , 60 , 200.99);


        System.out.println("= Biblioteca =");
        System.out.println("= LIVRO 1 =");
        System.out.println("Titulo:" + livro1.getTitulo());
        System.out.println("Autor:" + livro1.getAutor());
        System.out.println("Numero de página:" + livro1.getNumeroPagina());
        System.out.println("Preço:" + livro1.getPreco());
        System.out.println("---------------------------------------");
        System.out.println("= LIVRO 2 =");
        System.out.println("Titulo:" + livro2.getTitulo());
        System.out.println("Autor:" + livro2.getAutor());
        System.out.println("Numero de página:" + livro2.getNumeroPagina());
        System.out.println("Preço:" + livro2.getPreco());

    }
}
