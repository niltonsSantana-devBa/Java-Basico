package interfaces.example;

public class Main {
    static void main() {

        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        System.out.println("Cachorro: \n" + cachorro.emitirSom());
        System.out.println("Cachorro: \n" + cachorro.comer());
        System.out.println("Gato: \n" + gato.emitirSom());
        System.out.println("Gato: \n" + gato.comer());

    }
}
