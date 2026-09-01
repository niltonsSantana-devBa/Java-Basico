package interfaces;

public class Main {
    static void main() {

        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Galo galo = new Galo();
        Pato pato = new Pato();


        System.out.println("Cachorro:" + cachorro.emitirSom());
        System.out.println("Gato:" + gato.emitirSom());
        System.out.println("Galo:" + galo.emitirSom());
        System.out.println("Pato:" + pato.emitirSom());

    }
}
