import java.util.Scanner;

public class exemploRepetição {
    public static void main(String[] args) {
        // Criar um programa que solicite um número ao usuário e faça a tabuada
        // dele na tela, no formato: 1 X 1 = 1.... até 1 X 10 = 10

        int num;
        int cont;
        int result;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num = Integer.parseInt(input.nextLine());

        //cont = 1;
        /* while (cont <= 10){
            result = num * cont;
            System.out.println(num + " X " + cont + " = " + result);
            cont++;
        } */

        /* do {
            result = num * cont;
            System.out.println(num + " X " + cont + " = " + result);
            cont++;
        }
        while (cont <=10);
        */

        for (cont = 1; cont <=10; cont ++){
            result = num * cont;
            System.out.println(num + " X " + cont + " = " + result);
        }
    }
}
