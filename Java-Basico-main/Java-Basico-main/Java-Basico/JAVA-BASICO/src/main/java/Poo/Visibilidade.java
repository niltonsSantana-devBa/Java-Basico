package Poo;

public class Visibilidade {
    static void main() {
        //ALGORITIMO
//        String nome = "Nilton";
//               int idade = 23;
//    SEM ENCAPSULAMENTO
//    Clientes cliente1 = new Clientes();
//    cliente1.nome = "Nilton";
//    cliente1.idade =23;

        //COM ENCAPSULAMENTO(PRIVATE)
        Clientes clientes1 = new Clientes("Nilton" , 23);
//        clientes1.setNome("Nilton");
//        clientes1.setIdade(23);

        //Funcionario
        Funcionarios funcionario = new Funcionarios("Otavio" , 25, "Otavio@gmail.com");
//        funcionario.setNome("Otavio");
//        funcionario.setIdade(25);
//        funcionario.setEmail("Otavio@gmail.com");
        //Produtos
        Produtos produto1 = new Produtos("Miojo" , 12 ,83.90);
//        produto1.setNome("Miojo");
//        produto1.setQuantidade(12);
//        produto1.setPreco(83.90);

        Biblioteca livro1 = new Biblioteca("Harry poter" , "Alice " , 73 , 500.99);
        Biblioteca livro2 = new Biblioteca("Diario de um banna" , "Mauricio " , 60 , 200.99);


        System.out.println("= Clienetes = ");
        System.out.println("Nome: " + clientes1.getNome());
        System.out.println("Idade: " + clientes1.getIdade());
        System.out.println("--------------------------------------");
        System.out.println("= FUNCIONÀRIOS =");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Idade: " + funcionario.getIdade());
        System.out.println("Email: " + funcionario.getEmail());
        System.out.println("--------------------------------------");
        System.out.println("= Produtos =");
        System.out.println("Nome:" + produto1.getNome());
        System.out.println("Quantidade:" + produto1.getQuantidade());
        System.out.println("Preço:" + produto1.getPreco());
        System.out.println("---------------------------------------");
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
