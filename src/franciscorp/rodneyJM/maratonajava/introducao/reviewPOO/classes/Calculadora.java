package franciscorp.rodneyJM.maratonajava.introducao.reviewPOO.classes;

public class Calculadora {
    private CalculadoraType typeCalculator;


    //Constructor
    public Calculadora(CalculadoraType typeCalculator){
        this.typeCalculator = typeCalculator;
    }
    public class CalculatorVriation{
        public void show(){
            System.out.println("I'm some type of variation!");
        }
    }


    public void somarNumeros(int... numsList){
        int sum = 0;
        for(int num: numsList){
            sum+= num;
        }
        System.out.println(sum);
    }
}
