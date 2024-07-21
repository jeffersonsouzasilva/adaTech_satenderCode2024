import java.util.Scanner;

public class funcaoSomar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para digitar dois números
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        // Chama a função de soma e armazena o resultado
        int resultado = somar(numero1, numero2);

        // Exibe o resultado
        System.out.println("A soma de " + numero1 + " e " + numero2 + " é: " + resultado);

        // Fecha o scanner
        scanner.close();
    }

    // Função para somar dois números
    public static int somar(int a, int b) {
        return a + b;
    }
}
