/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

import java.util.Arrays;

/**
 *
 * @author erens
 */
public class null1945 {

    public static void main(String[] args) {
        String s = "leetcode";
        int k = 2;

        String a[] = s.split("");
        String alphabet[] = {
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
            "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
        };

        String convert = "";

        for (int i = 0; i < a.length; i++) {
            int index = Arrays.asList(alphabet).indexOf(a[i]);
            if (index != -1) {
                convert += Integer.toString(index + 1);
            }
        }
        
        String b[] = convert.split("");
        int result = 0;
        
        for (int i = 0; i < k; i++) {
            result = 0;
            for (int j = 0; j < b.length; j++) {
                result += Integer.parseInt(b[j]);
            }
            
           b = Integer.toString(result).split("");
           
            
        }

        System.out.println(result);

    }
}
