package interfaces.cauculadora;

public class Mutiplicacao implements OperacaoMatematica{
    @Override
    public double calcular(double a, double b) {
        return a*b;
    }
}
