package atividades.pet;

public class Main {
    static void main() {
        Pet cachorro = new Pet("kiko", 5, "rottweiler", "Grande", "ração");
        Pet gato =new Pet("Arian", 3,"Maine Coon", "Pequeno", "Raçao");


        System.out.println("= Cachorro =");
//        System.out.println("Nome: " + cachorro.getNome());
//        System.out.println("Idade: " + cachorro.getIdade());
//        System.out.println("Raça: " + cachorro.getRaca());
//        System.out.println("Porte: " + cachorro.getPorte());
//        System.out.println("Alimentação" + cachorro.getAlimentacao());
        System.out.println(cachorro.toString());
        System.out.println("--------------------------------");
//        System.out.println("= Gato =");
//        System.out.println("Nome: " + gato.getNome());
//        System.out.println("Idade: " + gato.getRaca());
//        System.out.println("Porte: " + gato.getPorte());
//        System.out.println("Alimentação: " + gato.getAlimentacao());
        System.out.println(gato.toString());
    }
}
