package franciscorp.rodneyJM.maratonajava.introducao;
import java.util.Scanner;
public class BreakExercise {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double valorCarro = ler.nextDouble();
        int parcelas = 1;

        for(int i=1; i<valorCarro;i++){
            double valorParcela = valorCarro/i;
            if(valorParcela< 1000) {
                break;
            }
            parcelas = i;
        }

        System.out.print("Com o valor "+ valorCarro+" você pode parcela-lo em até: "+parcelas+" vezes");
    }
}
