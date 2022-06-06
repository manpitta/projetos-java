package Atividade1;

public class Retornos {
    public static void main(String[]args){
        Funcionarios f1 = new Funcionarios("Leandro",38,"Administrador","Ativo");
        Funcionarios f2 = new Funcionarios("Rodger",30,"Cientista Político","Ativo");
        Funcionarios f3 = new Funcionarios("Amanda",26,"Desenvolvedora Java Full Stack","Ativo");
        Funcionarios f4 = new Funcionarios("Márcia",44,"Assistente Social","Ativo");

        System.out.println(f1.getNome()+", encontra-se inativo na empresa.");
        f1.setSituacao(f1.demitirFuncionario());
        System.out.println("Status atual: "+f1.getSituacao());

        System.out.println("");

        System.out.println("Parabéns " +f2.getNome()+", você foi promovido!");
        f2.setCargo(f2.trocarCargoFuncionario(f2.getCargo()));
        System.out.println("Status atual: "+f2.getCargo());

        System.out.println("");

        System.out.println("Olá " +f3.getNome()+", parabéns pelo seu dia!");
        f3.setIdade(f3.aniversario());
        System.out.println("Status atual: "+f3.getIdade());

        System.out.println("");

        System.out.println("Olá " +f4.getNome()+", "+f4.pagarSalario());

    }
}
