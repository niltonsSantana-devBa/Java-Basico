package interfaces.cauculadora;

public class Subtraca implements OperacaoMatematica {
    @Override
    public double calcular(double a, double b) {
        return a-b;
    }
}
