package atividades.endereco;

public class Main {
    static void main() {

        Endereco endereco1 = new Endereco("Rua B", 20, "Salvador");
        Clientes cliente1 = new Clientes("Nilton",23, endereco1);

        System.out.println(" = DADO DO CLIENTE - 1 = ");
        System.out.println(cliente1.toString());

    }
}
