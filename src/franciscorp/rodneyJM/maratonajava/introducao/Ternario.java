package franciscorp.rodneyJM.maratonajava.introducao;

public class Ternario {
    public static void main(String[] args) {
        int salario = 3000;
        String msgDoar = "Que ótimo! Posso doar!";
        String msgNaoDoar = "Desculpe-me, mas eu não possuo condições";
        String resultado = (salario>3000)? msgDoar: msgNaoDoar;

        System.out.print(resultado);
    }
}
