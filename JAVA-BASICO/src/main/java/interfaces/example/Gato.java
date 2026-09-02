package interfaces.example;

public class Gato implements Animal {
    @Override
    public String emitirSom() {
        return "MIAUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!";
    }

    @Override
    public String comer() {
        return "RATO";
    }
}
