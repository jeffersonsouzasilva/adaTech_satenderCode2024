import java.util.Scanner;

public class vetorComForeach {
    public static void main(String[] args) {
        //crie um programa simples em java 17 usando arrays e foreach simulando entrada de cinco numeros e exibindo ao final a posição e o valor digitado

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        // Entrada de cinco números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número para a posição " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Exibindo posição e valor usando foreach
        int posicao = 1;
        for (int numero : numeros) {
            System.out.println("Posição: " + posicao + " - Valor: " + numero);
            posicao++;
        }

        scanner.close();
    }
}
