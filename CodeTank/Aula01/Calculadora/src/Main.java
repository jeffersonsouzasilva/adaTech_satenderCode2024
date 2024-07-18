import java.util.Scanner;

public class Main {
    static enum operacao{
        SOMA, SUBTRA
    }

    public static void main(String[] args) {
        // Primeira parte da aula //
        //Criação de um input com a classe Scanner
//        Scanner input = new Scanner(System.in); // in metodos responsaveis para entrada de dados
//        int num1;
//        int num2;
//        int result;
//
//        System.out.println("Digite um número:");
//        num1 = input.nextInt(); // capiturar dado como inteiro
//        System.out.println("Digite outro número:");
//        num2 = input.nextInt(); // capiturar dado como inteiro
//
//        result = num1 + num2;
//        System.out.println(result);
//
//        result = num1 - num2;
//        System.out.println(result);
//
//        result = num1 * num2;
//        System.out.println(result);
//
//        result = num1 / num2;
//        System.out.println(result);



        // Segunda parte da aula //
        /*
        Estruturas de Seleção - Desvios
        if - se
        É uma estrutura de desvio onde se realize um teste lógico para executar
        determinada(s) linha(s) de código. Esse teste pode ser V ou F

        EX: Dada a nota informada por um aluno, exiba se ele está aprovado (média >=7), em
        prova final (média entre 6 e 6.9) ou reprovado (média abaixo de 6)

         */
//        double media;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Informe a sua média: ");
//        media = input.nextDouble();
//        if (media < 6){
//            System.out.println("Reprovado");
//        }
//        else if (media >= 6 && media < 7){
//            System.out.println("Em Prova Final");
//        }
//        else if (media >= 7 && media < 10){
//            System.out.println("Aprovado");
//        }
//        else {
//            System.out.println("Nota inválida");
//        }

        /*
        Exercício 6: Verificar o Maior de Três Números
        Escreva um programa que aceite três números inteiros e determine o maior entre eles.
         */
//        Scanner input = new Scanner(System.in);
//        int num1;
//        int num2;
//        int num3;
//
//        System.out.println("Digite um número:");
//        num1 = input.nextInt();
//
//        System.out.println("Digite um número:");
//        num2 = input.nextInt();
//
//        System.out.println("Digite um número:");
//        num3 = input.nextInt();
//
//        if (num1 > num2 & num1 > num3){
//            System.out.println("Numero 1 é maior");
//        }
//        else if (num2 > num1 & num2 > num3){
//            System.out.println("Numero 2 é maior");
//        } else if (num3 > num1 & num3 > num2){
//            System.out.println("Numero 3 é maior");
//        } else {
//            System.out.println("Valor igual");
//        }

    /*
    Exercício 1: Enum com Switch-Case e Scanner
    Crie um enum chamado OperacaoMatematica representando operações matemáticas básicas (+, -, *, /).
    Utilize um Scanner para obter a operação do usuário e realizar o cálculo com dois números.

     */

    }
}