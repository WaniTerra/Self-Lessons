package O;

import java.util.*;

public class null1337 {
    public static void main(String[] args) {
       
        int[][] mat = {
            {1, 1, 0, 0, 0},
            {1, 1, 1, 1, 0},
            {1, 0, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {1, 1, 1, 1, 1}
        };
        int k = 3;

        
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int [] result = new int[k];

        
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            map.put(i, count);  
        }

      
        ArrayList<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());

       
        Collections.sort(entryList, (entry1, entry2) -> {
            
            int countComparison = entry1.getValue().compareTo(entry2.getValue());
            
            
            if (countComparison == 0) {
                return entry1.getKey().compareTo(entry2.getKey());
            }

            return countComparison; 
        });
        
        for (int i = 0 ;i <k;i++){
        result[i] = entryList.get(i).getKey();
    }
        
        for (int i = 0 ;i <k;i++){
            System.out.println(result[i]);
        }
        //return result;
        
        
    }
}
