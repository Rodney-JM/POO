package franciscorp.rodneyJM.maratonajava.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        //Casting=> Conversão

        int idade = 10;
        double salarioDouble = 1232.23;
        float salarioFloat = 232F;//Utilizamos o F para indicar para o computador que o numero alocado é flaot
        byte idadeByte = 10;//limite de 127
        short idadeShort = 10;
        boolean verd = true;
        boolean falso = false;
        char caractere = 'f';

        //casting exemplo

        int castingExemple = (int) 130923004293042934L;

        System.out.println(castingExemple);
    }
}
