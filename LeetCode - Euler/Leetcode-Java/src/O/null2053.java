package O;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class null2053 {

    public static void main(String[] args) {
        String[] arr = {"d", "b", "c", "b", "c", "a"};
        int k = 2; 
        String result = "";

      
        if (k <= 0) {
            result = ""; 
        } else {
            Map<String, Integer> countMap = new HashMap<>();

           
            for (String str : arr) {
                countMap.put(str, countMap.getOrDefault(str, 0) + 1);
            }

            
            List<String> uniqueValues = new ArrayList<>();
            for (String str : arr) {
             
                if (countMap.get(str) == 1) {
                    uniqueValues.add(str);
                }
            }

          
            if (k - 1 < uniqueValues.size()) { 
                result = uniqueValues.get(k - 1); 
            } else {
                result = "";
            }
        }

        System.out.println(result);
        //return result;
    }
}
