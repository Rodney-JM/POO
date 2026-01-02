package franciscorp.rodneyJM.maratonajava.introducao.dataStructures;

import java.util.HashMap;
import java.util.Map;

public class HashMapStructure {
    public static void main(String[] args){
        HashMap<String, Integer> materias = new HashMap<>();
        materias.put("Matéria um", 42);
        materias.put("Matéria dois", 432);

        for(String chave : materias.keySet()){
            System.out.println(chave);
        }

        for(Integer values : materias.values()){
            System.out.println(values);
        }

        for(Map.Entry<String, Integer> entry : materias.entrySet()){
            System.out.println(entry);
        }

        HashMap<String, String> randman = new HashMap<>();

         randman.put("a", "b");

         char[] chars = randman.get("a").toCharArray();
         

    }
}
