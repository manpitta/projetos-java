package Aula3;

public class Principal {
    public static void main(String[] args) {
        Animal a1 = new Animal("Totó", "cachorro", 4);
        Animal a2 = new Animal("Otto", "gato", 1);

        System.out.println("O nome do animal a1 é: " + a1.getNome());
        a1.setNome("Laila");

        System.out.println("O nome do animal a1 é: " + a1.getNome());
        System.out.println("O nome do animal a2 é: " + a2.getNome());
        System.out.println("A idade do animal a2 é: " + a2.getIdade());
    }



}
