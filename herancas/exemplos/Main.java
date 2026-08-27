package herancas.exemplos;

public class Main {
    static void main() {
        Funcionario fun1 = new Funcionario("Nilton", 30,"719632554123","6325","Gerente", "30000 R$",
                "12345678998762","632558749");
        Cliente cliente = new Cliente("Carlos",50,"71956988547","21/07/2026","PIX","89654885699",
                "2032112585","14/02/2000");

        System.out.println(cliente);
        System.out.println(fun1);

    }
}
