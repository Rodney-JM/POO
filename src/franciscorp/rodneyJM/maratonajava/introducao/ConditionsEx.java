package franciscorp.rodneyJM.maratonajava.introducao;
import java.util.Scanner;

public class ConditionsEx {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double salario = ler.nextDouble();
        double impostos;

        if(salario<2259){
            impostos = 0;
        }else if (salario>2259 && salario<2826){
            impostos = 7.5/100 * salario;
        }else if (salario>2826 && salario<3751){
            impostos = 15/100 * salario;
        }else if (salario>3751 && salario <4664){
            impostos = 22.5/100 * salario;
        }else{
            impostos = 27.5/100*salario;
        }

        System.out.print("O seu salário é de: "+salario+" e o seus impostos equivalem a: "+impostos);
    }
}
