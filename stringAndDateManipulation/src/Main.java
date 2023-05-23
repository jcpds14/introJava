import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Crie esta mensagem Olá {nome}. Hoje é {dia-da-semana}, BOM DIA.
//
//        String nome = "Jean Carlos";
//        System.out.println(nome.toUpperCase());
//        System.out.println(nome.toLowerCase());
//        System.out.println(nome.length());
//
//        String outroNome = "Jean Carlos";
//        System.out.println(outroNome.equalsIgnoreCase(nome));
    String name = "Jean";
    //  ISO 8601 - formato mundial de data padrão
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
    //  System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

        String saudacao;
        LocalDateTime agora = LocalDateTime.now();

        if(agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "bom dia!";
        }else if(agora.getHour() >= 12 && agora.getHour() < 18){
            saudacao = "boa tarde!";
        }else{
            saudacao = "boa noite!";
        }

        System.out.printf("Olá %s. Hoje é %s, %s.%n", name, diaDaSemana, saudacao.toUpperCase());
    }
}