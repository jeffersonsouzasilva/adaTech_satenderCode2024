import java.util.Scanner;

public class mediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double media;
        double nota1;
        double nota2;
        // Lê o nome do aluno
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        // Lê a primeira nota e converte para double
        System.out.print("Digite a primeira nota: ");
        nota1 = Double.parseDouble(scanner.nextLine());

        // Lê a segunda nota e converte para double
        System.out.print("Digite a segunda nota: ");
        nota2 = Double.parseDouble(scanner.nextLine());

        // Calcula a média
        media = (nota1 + nota2) / 2;

        // Exibe o nome do aluno e a média
        System.out.printf("Nome do aluno: %s%n", nome);
        System.out.printf("Média: %.2f%n", media);

        scanner.close();
    }
}
