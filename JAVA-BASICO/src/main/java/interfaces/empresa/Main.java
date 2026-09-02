package interfaces.empresa;

public class Main {
    static void main() {
        Motoboy motoboy = new Motoboy(
                "Nilton",
                "20/11/2002",
                Sexo.MASCULINO,
                Setor.OPERACOES,
                30000.0,
                "AB"
                 );

        Direitor direitor = new Direitor(
                "Maria",
                "14/05/2000",
                Sexo.FEMININO,
                Setor.FINANCEIRO,
                2000
                );

        System.out.println(direitor.toString());
        direitor.admitir(motoboy);

    }
}
