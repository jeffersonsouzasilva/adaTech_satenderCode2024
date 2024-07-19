import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        // Entrada de cinco números
        for (int i = 0; i < numeros.length; i ++){
            System.out.println("Digite o número para a posição " + (i + 1) + " : ");
            numeros[i] = scanner.nextInt();
        }

        // Exibindo posição e valor usando foreach

        for (int numero : numeros){
            System.out.println("Valor: " + numero);
        }

        scanner.close();
    }
}
