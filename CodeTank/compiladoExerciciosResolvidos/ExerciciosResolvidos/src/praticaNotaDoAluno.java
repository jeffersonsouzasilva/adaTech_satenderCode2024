import java.util.Scanner;

public class praticaNotaDoAluno {
    public static void main(String[] args){

        /* Estruturas de Seleção - Desvios
     if -> se
     É uma estrutura de desvio onde se realiza um teste lógico para executar
     determinada(s) linha(s) de código. Esse teste pode ser V ou F

     EX: Dada a nota informada por um aluno, exiba se ele está aprovado (média >=7), em
     prova final (média entre 6 e 6.9) ou reprovado (média abaixo de 6)

     */

        double media;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a sua média: ");
        media = input.nextDouble();
        if (media >=0 && media < 6){
            System.out.println("Reprovado");
        }
        else if (media >=6 && media <7){
            System.out.println("Em Prova Final");
        }
        else if (media >=7 && media <=10) {
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Nota inválida");
        }



    }
}
