import java.util.Scanner;

public class tratamentoDeExcecao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print("Digite um número: ");
            String entrada = scanner.nextLine();

            try {
                numero = Integer.parseInt(entrada);
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número válido.");
            }
        }

        System.out.println("Você digitou o número: " + numero);
        scanner.close();
    }
}
