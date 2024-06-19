public class Main {
    public static void main(String[] args) {
        //Atalho no Intelig para " System.out.println ", só digitar " sout "

//        boolean resultado = false;
//        System.out.println(resultado);

        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;

        //Operador && (AND)
        //Operador || (OR)
        System.out.println(vamosAPraia);


        String mesagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mesagem);

    }
}