package atividades.funcionario;

import atividades.livro.Livro;

public class Main {
    static void main() {


        Livro livro = new Livro("O principe","Nilton", 66, 55);
        Funcionarios funcionario = new Funcionarios("Carlos", "12345678999","12/02/1999", "teste@gmail.com");

        System.out.println("= LIVROS =");
        System.out.println("Titulo: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Numero de paginas: " + livro.getNumeroPagina());
        System.out.println("Preço: " + livro.getPreco());

        System.out.println("= Funcionarios =");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("CPF: " + funcionario.getCpf());
        System.out.println("Data de nascimento: "  + funcionario.getDataDeNascimento());
        System.out.println("Email: " + funcionario.getEmail());
    }
}
