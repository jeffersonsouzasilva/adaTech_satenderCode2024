public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");


        //Aula falando de Variáveis
        //Documentação Java tipos primitivos
        //String nome;
        //nome= "Let's Code";
        //nome= "Brasil";
        //nome= "Jefferson";
        //System.out.println(" Olá " + nome);

        int a;
        int b = 2;
        a = 3;
        int soma = a + b;
        int subtracao = a - b;
        int multipicacao = a * b;
        float divisao = (float) a / b; // para essa operação temos um problemas, pois JAVA entende que a divisão de dois inteiros é inteiro, sendo assim adiciono entre parênteses tipo que quero representado no resultado

        System.out.println("soma = a + b é " + soma);
        System.out.println("subtracao = a - b é " +subtracao);
        System.out.println("multipicacao = a * b é " +multipicacao);
        System.out.println("soma = a + b é " +divisao);
    }
}