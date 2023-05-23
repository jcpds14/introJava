// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        boolean fds = true;
        boolean fazendoSol = false;
        boolean vamosAPraia = fds && fazendoSol;

        //Tabela Verdade
        //Operador && (AND)
        //true && true = true
        //true && false = false
        //false && true = false
        //false && false = false

        //Tabela Falso
        //Operador || (OR)
        //true || true = true
        //true || false = true
        //false || true = true
        //false || false = false

        System.out.println(vamosAPraia);

        String mensagem = fds && fazendoSol ? "É fim de semana e faz Sol, Vamos a praia!!!" : "Não é fim de semana ou não faz Sol, não vamos a praia :(";
        System.out.println(mensagem);
    }
}