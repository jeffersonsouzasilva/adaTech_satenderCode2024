import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //Pratica Calculadora
        //Criação de um input com a classe Scanner
        Scanner input  = new Scanner(System.in);
        double num1;
        double num2;
        double result;
        // int num1, num2, result;
        System.out.print("Digite um número:");
        num1 = input.nextDouble();
        System.out.print("Digite outro número:");
        num2 = input.nextDouble();

        result = num1 + num2;
        System.out.println(result);

        result = num1 - num2;
        System.out.println(result);

        result = num1 * num2;
        System.out.println(result);

        result = num1 / num2;
        System.out.println(result);



    }
}