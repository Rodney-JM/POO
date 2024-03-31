package franciscorp.rodneyJM.maratonajava.introducao;

public class ArraysMultidimensionais2 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[2];
        arrayInt[2] = new int[3];

        int[][] arrayInt2 = {{1,2,3,4,5},{1,2,34}};

        for (int[] arrBase:arrayInt){
            for (int num:arrBase){
                System.out.println(num);
            }
        }
    }
}
