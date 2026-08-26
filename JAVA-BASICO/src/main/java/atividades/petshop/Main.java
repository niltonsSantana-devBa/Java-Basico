package atividades.petshop;

public class Main {
    static void main() {

        Pets dog = new Pets("Trovão", 2, "Pasto alemão");
        Clientes cliente1 =new Clientes("Maicon", 20, dog);

        System.out.println(cliente1.toString());
    }
}
