package interfaces;

public class Cachorro implements Animal {
    @Override
    public String emitirSom() {
        return "AUAU!!!!!!! AUAU!!!!!!!! AUAU!!!!!";
    }

    @Override
    public String comer() {
        return "CARNE";
    }
}
