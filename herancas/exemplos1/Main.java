package herancas.exemplos1;

public class Main {
    static void main() {
        Processador proc1 = new Processador("AMD","RAYZN 9 1055k", "5999");
        Memoria men1 = new Memoria("CORSER","DDR5","32G" );
        PlacaMae p1 = new PlacaMae("Asus", "T51", "coisa");
        DispositivoArm d1 = new DispositivoArm("Intel" , "G50", "500", "TIM");


        System.out.println(proc1);
        System.out.println(men1);
        System.out.println(p1);
        System.out.println(d1);

    }
}
