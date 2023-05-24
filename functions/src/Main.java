// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String nomeOriginal = "Jean Carlos";
        saudacao(nomeOriginal);
        int resultado = result(25,32);
        System.out.println("O resultado da soma é: " + resultado);
    }
    public static void saudacao(String nomeParamet){
        System.out.println("Olá "  + nomeParamet);
    }
    public static int result(int a, int b){
        return a + b;
    }
}