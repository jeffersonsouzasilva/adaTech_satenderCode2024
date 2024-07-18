import java.util.Scanner;

public class praticaAula02 {
    /*
    Exercício 1: While - Números Primos
    Escreva um programa que solicita ao usuário para inserir um número e verifica se esse número é primo ou não.
    Ao final, perguntar se o usuário deseja repetir. A saída é digitar -1


    pra testaren
    2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
    todos esses sao primos
    testa os que nao sap
    sao
     */
    
    public static void main (String[] args){
        int num;
        int cont = 1;
        Scanner input = new Scanner(System.in);
        System.out.println(" Exercicio de número primo ");
        System.out.println(" Digite um número ");
        num = Integer.parseInt(input.nextLine());

        while (cont != -1){
            if (num % 2 == 1){
                System.out.println("O numero é primo");
            } else {
                System.out.println("Não é um número primo");
            }
            System.out.println(" Caso queira sair com código digite -1 ");
            cont = Integer.parseInt(input.nextLine());
        }
        System.out.println(" Sistema encerrado ! ");
    }

}
