package Aula2;

public class Metodos {
    public static void main (String [] args){
        impressao();
        mensagem ("Java é vida!");
        System.out.println("O dobro do número é " + dobro (10));
        for (int i = 1; i < 11; i++){
            System.out.println("O fatorial de " + i + " é " + fatorial(i));
        }
        System.out.println("O resultado é " + calc(2,3));
        System.out.println("O resultado é " + calc(2.5, 3.1));
        System.out.println("O resultado é " + calc(2,3,4));

        double[] notas = {9.5, 5.8, 7.9, 9, 8.7, 7};
        System.out.printf("%s%.2f","A média das notas é: ", calc(notas));


    }

    //Metodos sem retornos e sem parâmetros//

    public static void impressao(){
        System.out.println("Java é lindo");

    }

    //Metodos sem retornos COM parâmetros//

    public static void mensagem(String msg){
        System.out.println (msg);

    }

    //Metodos com retorno//
    public static int dobro (int numero){
        return numero * 2;
    }

    //Calculando um fatorial - multiplica por seus antecessores até chegar em 01//

    public static int fatorial (int numero){
        int fatorial = 1;
        for (int cont = numero; cont > 0; cont --){
            fatorial *=cont;
        }
        return  fatorial;
    }
//sobrecarga de metodos

    public static int calc(int num1, int num2){
        return num1 + num2;
    }
    public static double calc(double num1, double num2){
        return num1 + num2;
    }
    public static int calc(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public static double calc(double[] numeros){
        double soma = 0;
        for(double n:numeros){
            soma += n;
        }
        return soma/numeros.length;
    }

    }
