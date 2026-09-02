package interfaces.example;

public class Cachorro implements Animal {
    @Override
    public String emitirSom() {
        return "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!!!!";
    }

    @Override
    public String comer() {
        return "Carne crua";
    }
}
