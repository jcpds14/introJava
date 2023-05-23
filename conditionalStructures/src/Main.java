// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int nota = 50;
        String graduacao = "";

        if(nota >=70){
            graduacao = "A";
        }else if (nota < 70 && nota >=60){
            graduacao = "B";
        }else if (nota < 60 && nota >= 50){
            graduacao = "C";
        } else if (nota < 50 && nota >= 0) {
            graduacao = "D";
        }else {
            System.out.println("Nota inválida!");
        }

        switch(graduacao){
            case "A":
            case "B":
                System.out.println("Aprovado!");
                break;
            case "C":
                System.out.println("Recuperação!");
                break;
            case "D":
                System.out.println("Reprovado!");
                break;
            default:
                System.out.println("Graduação inválida!");

        }
    }
}