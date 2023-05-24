import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        String[] letras = {"A", "B", "C", "D", "E"};
        for (int i = 0; i < letras.length; i++) {
            System.out.printf(letras[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(letras));

        //Maior, Menor e Média
        int[] numbers = {9, 10, 12, 25, 22, 31};
        int maior = numbers[0];
        int menor = numbers[0];
        int media = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maior) {
                maior = numbers[i];
            } else if (numbers[i] < menor) {
                menor = numbers[i];
            }
            media += numbers[i];
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + (double) media / numbers.length);
        }
    }