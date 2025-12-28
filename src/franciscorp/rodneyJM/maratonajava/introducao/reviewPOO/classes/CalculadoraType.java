package franciscorp.rodneyJM.maratonajava.introducao.reviewPOO.classes;

public enum CalculadoraType {
    SCIENTIFIC(1){
        @Override
        public void somarNumeros(){
            System.out.println();
        }
    },
    NORMAL(2) {
        @Override
        public void somarNumeros() {
            System.out.println("Numeros somados example 11");
        }
    };

    private final int VALOR;

    CalculadoraType(int valor){
        this.VALOR = valor;
    }

    public abstract void somarNumeros();
}
