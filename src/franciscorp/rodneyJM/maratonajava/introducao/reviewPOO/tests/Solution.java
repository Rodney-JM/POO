package franciscorp.rodneyJM.maratonajava.introducao.reviewPOO.tests;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n){
        List<String> list = new ArrayList<>(n);

        for(int i = 1; i<= n; i++){
            if(i%3==0 && i%5==0){
                list.set(i, "FizzBuzz");
            }else if(i%3==0){
                list.set(i, "Fizz");
            } else if (i%5==0) {
                list.set(i, "Buzz");
            } else{
                list.set(i, String.valueOf(i));
            }
        }

        return list;
    }
}
