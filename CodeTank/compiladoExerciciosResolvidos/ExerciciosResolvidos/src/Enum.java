import java.util.Scanner;

public class Enum {
    enum OperacaoMatematica {
        SOMA, SUBTRACAO, MULTIPLICACAO, DIVISAO
    }

    public static void main(String[] args) {

        OperacaoMatematica operacao = null;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char operacaoChar = scanner.next().charAt(0);


        switch (operacaoChar) {
            case '+':   operacao = OperacaoMatematica.SOMA;
                break;
            case '-':   operacao = OperacaoMatematica.SUBTRACAO;
                break;
            case '*':   operacao = OperacaoMatematica.MULTIPLICACAO;
                break;
            case '/':   operacao = OperacaoMatematica.DIVISAO;
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }

        double resultado = switch (operacao) {
            case SOMA -> num1 + num2;
            case SUBTRACAO -> num1 - num2;
            case MULTIPLICACAO -> num1 * num2;
            case DIVISAO -> {
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero.");
                    scanner.close();
                }
                yield num1 / num2;
            }
        };

        System.out.println("O resultado é: " + resultado);
        scanner.close();
    }
}
