/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

import java.util.HashSet;

/**
 *
 * @author erens
 */
public class null1805 {
    public static void main(String[] args) {
        String word = "leet1234code234";
        
        String newWord = word.replaceAll("[a-zA-Z]+", " ").trim();;
         HashSet<String> seen = new HashSet<>();
        String arr[] = newWord.split("\\s+");
        int result = 0;
        
        
        for (String num : arr) {
            if (!num.isEmpty() && seen.add(String.valueOf(Integer.parseInt(num)))) {
                result++;
            }
        }
      
        
        System.out.println(result);
        //return result;
                
    }
}
