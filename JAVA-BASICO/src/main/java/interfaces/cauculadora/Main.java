package interfaces.cauculadora;

public class Main {
    static void main() {

        Soma soma = new Soma();
        Subtraca subtracao = new Subtraca();
        Mutiplicacao mutiplicacao = new Mutiplicacao();
        Divisao divisao = new Divisao();


        System.out.println("Soma: \n" + soma.calcular(10,6));
        System.out.println("Subtração: \n" + subtracao.calcular(45,6));
        System.out.println("Mutiplicação: \n" + mutiplicacao.calcular(5,895));
        System.out.println("Divisão: \n" + divisao.calcular(50,5));
    }
}
