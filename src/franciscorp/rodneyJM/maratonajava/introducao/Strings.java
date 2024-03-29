package franciscorp.rodneyJM.maratonajava.introducao;

public class Strings {
    public static void main(String[] args) {
        //A String não é um tipo primitivo

        String nome = "Rodney"; //Aspas duplas obrigatoriamente

        nome = nome.toUpperCase();
        nome = nome.replaceAll("Rodney", "Rondiney");
        System.out.print(nome);
    }
}
