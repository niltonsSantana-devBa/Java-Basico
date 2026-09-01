package interfaces;

public class Pato implements Animal {
    @Override
    public String emitirSom() {
        return "QUEEEEEMMMMM !!!!!! QUEEEEEEEMMMMMM !!!!!!!";
    }

    @Override
    public String comer() {
        return "PEIXE";
    }
}
