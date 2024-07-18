import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Criar um programa que solicite um número ao usuário e faça a tabuada
       // dele na tela, no formato: 1 X 1 = 1..... até 1 X 10 = 10

        /*OPÇÃO
        Scanner sc = new Scanner(System.in);
        int numero = Integer.parseInt(sc.nextLine());
        for(int i=1; i<=10; System.out.printf("%s X %s = %s%n", numero, i, numero*i++));
         */


        int num;
        int cont;
        int result;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num = Integer.parseInt(input.nextLine());
        //WHILE
        //cont = 1;
        /* while (cont <= 10){
            result = num * cont;
            System.out.println(num + " X " + cont + " = " + result);
            cont++;
        } */
        //DO WHILE
        /* do {
            result = num * cont;
            System.out.println(num + " X " + cont + " = " + result);
            cont++;
        }
        while (cont <=10);
        */

        //FOR
        for (cont = 1; cont <=10; cont ++){
            result = num * cont;
            System.out.println(num + " X " + cont + " = " + result);
        }


    }
}