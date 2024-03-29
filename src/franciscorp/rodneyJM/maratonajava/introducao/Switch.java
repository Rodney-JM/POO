package franciscorp.rodneyJM.maratonajava.introducao;
import java.util.Locale;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String sexo = ler.nextLine();
        sexo = sexo.toLowerCase();
        sexo = sexo.trim();

        switch (sexo){
            case "homem":
                System.out.print("Você é um Homem");
                break;
            case "mulher":
                System.out.print("Você é uma mulher");
                break;
            default:
                System.out.print("O que...você é?");
                break;
        }
    }
}
