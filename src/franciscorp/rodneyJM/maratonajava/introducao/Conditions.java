package franciscorp.rodneyJM.maratonajava.introducao;

public class Conditions {
    public static void main(String[] args) {
        int idade = 12;

        if (idade< 15){
            System.out.print("Categoria infantil");
        }else if (idade>=15 && idade<18){
            System.out.print("Categoria Juvenil");
        }else {
            System.out.print("Categoria Adulto");
        }
    }
}
