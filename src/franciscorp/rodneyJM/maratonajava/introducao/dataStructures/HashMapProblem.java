package franciscorp.rodneyJM.maratonajava.introducao.dataStructures;

import java.util.HashMap;

public class HashMapProblem {
    /*public boolean canConstruct(String ransomNote, String magazine){
        HashMap<Character, Integer> count = new HashMap<>();

        //contando as letras da magazine
        for (char c: magazine.toCharArray()){
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        //tentando montar o ransomNote

        for(char c: ransomNote.toCharArray()){
            if(!count.containsKey(c) || count.get(c) == 0){
                return false;
            }

            count.put(c, count.get(c) - 1);
        }

        return true;
    }*/

    public boolean canConstruct(String ransomNote, String magazine){
        int[] count = new int[26];

        for(char c: magazine.toCharArray()) count[c - 'a']++;

        for(char c: ransomNote.toCharArray()){
            if( --count[c - 'a'] < 0) return false;
        }

        return true;
    }
}
