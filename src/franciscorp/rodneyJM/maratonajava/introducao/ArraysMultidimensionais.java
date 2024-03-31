package franciscorp.rodneyJM.maratonajava.introducao;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        int[][] meses = new int[12][31];

        meses[0][2] = 21;
        System.out.println(meses[0][2]);

        for (int i = 0;i<meses.length;i++){
            for (int j = 0;j<meses[i].length; j++){
                System.out.println(meses[i][j]);
            }
        }

        for (int[] arrBase:meses){
            for (int num:arrBase){
                System.out.println(num);
            }
        }
    }
}
