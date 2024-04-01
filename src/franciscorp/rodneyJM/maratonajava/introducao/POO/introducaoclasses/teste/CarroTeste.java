package franciscorp.rodneyJM.maratonajava.introducao.POO.introducaoclasses.teste;

import franciscorp.rodneyJM.maratonajava.introducao.POO.introducaoclasses.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro_dos_sonhos = new Carro();
        Carro primeiro_carro = new Carro();

        carro_dos_sonhos.name = "FERRARI F8-SPIDER";
        carro_dos_sonhos.ano = 2022;
        carro_dos_sonhos.modelo = "3.9 V8 TURBO GASOLINA F1-DCT";

        primeiro_carro.name = "Renault Kwid Zen";
        primeiro_carro.ano = 2020;
        primeiro_carro.modelo = "Renault Kwind Zen 1.0";

        //carro_dos_sonhos = primeiro_carro; Referencia de objetos

        System.out.println("Carro: "+ carro_dos_sonhos.name+ "\nAno: "+ carro_dos_sonhos.ano+ "\nModelo: "+ carro_dos_sonhos.modelo);
        System.out.println("\nCarro: "+ primeiro_carro.name+ "\nAno: "+ primeiro_carro.ano+ "\nModelo: "+ primeiro_carro.modelo);
    }
}