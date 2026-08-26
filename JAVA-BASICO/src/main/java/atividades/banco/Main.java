package atividades.banco;

import atividades.endereco.Endereco;

public class Main {
    static void main() {
        Endereco endereco1 = new Endereco("Rua C", 8,"Salvador");
        ContaBancaria contaBancaria = new ContaBancaria("Master", 54, 987594,"Corrente",1.5,"0");
        Funcionario funcionario1 = new Funcionario("Gustavo",Sexo.MASCULINO ,5458, endereco1 ,"71998596569","gustavo@gmail.com",
        contaBancaria, Associado.DESLIGADO,Setor.FINANCEIRO );


        System.out.println(funcionario1.toString());
    }
}
