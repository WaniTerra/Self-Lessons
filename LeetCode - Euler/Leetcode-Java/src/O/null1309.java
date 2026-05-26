/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author erens
 */
public class null1309 {

    public static void main(String[] args) {
        String s = "124";
        String real = "";

        Map<String, String> map = new HashMap<>();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");
        map.put("4", "d");
        map.put("5", "e");
        map.put("6", "f");
        map.put("7", "g");
        map.put("8", "h");
        map.put("9", "i");

        Map<String, String> map1 = new HashMap<>();
        map1.put("10", "j");
        map1.put("11", "k");
        map1.put("12", "l");
        map1.put("13", "m");
        map1.put("14", "n");
        map1.put("15", "o");
        map1.put("16", "p");
        map1.put("17", "q");
        map1.put("18", "r");
        map1.put("19", "s");
        map1.put("20", "t");
        map1.put("21", "u");
        map1.put("22", "v");
        map1.put("23", "w");
        map1.put("24", "x");
        map1.put("25", "y");
        map1.put("26", "z");

        
        int i = 0;
        while (i < s.length()) {
            
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                String twoDigits = s.substring(i, i + 2); 
                real += map1.get(twoDigits);  
                i += 3; 
            } else {
                
                String oneDigit = String.valueOf(s.charAt(i));
                real += map.get(oneDigit);  
                i++;  
            }
        }
        System.err.println(real);
        //return real;  
    }
}
