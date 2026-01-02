package franciscorp.rodneyJM.maratonajava.introducao.reviewPOO.tests;

import franciscorp.rodneyJM.maratonajava.introducao.reviewPOO.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args){
        Calculadora calc1 = new Calculadora();
        Calculadora.CalculatorVriation variation = calc1.new CalculatorVriation();

        variation.show();

        calc1.somarNumeros(1,2,35,6,56,56,5,65,66,56);
    }
}
