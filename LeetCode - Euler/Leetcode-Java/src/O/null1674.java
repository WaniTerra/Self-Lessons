package O;

import java.util.ArrayList;
import java.util.HashMap;

public class null1674 {
    public static void main(String[] args) {
        String s = "abdjsa";
        
        HashMap<Character, Integer> firstOccurrence = new HashMap<>();
        int maxLength = -1;
        
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            
            if (firstOccurrence.containsKey(c)) {
                int length = i - firstOccurrence.get(c) - 1;  
                maxLength = Math.max(maxLength, length);  
            } else {
                
                firstOccurrence.put(c, i);
            }
        }
        
        System.out.println(maxLength);
        //return maxLength;
    }
}
