/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author erens
 */
public class null1078 {
    public static void main(String[] args){
        
        String text = "jkypmsxd jkypmsxd kcyxdfnoa jkypmsxd kcyxdfnoa jkypmsxd kcyxdfnoa kcyxdfnoa jkypmsxd kcyxdfnoa";
        String first =  "kcyxdfnoa";
        String second = "jkypmsxd";
        
        int a = 0;
        
        ArrayList<String> textA = new ArrayList<>(Arrays.asList(text.split(" ")));
        ArrayList<String> resultAr = new ArrayList<>();
        
        for(int i = 0; i < textA.size(); i++){
            if (textA.get(i).equals(first) && i <= textA.size() - 3){
                if(textA.get(i + 1).equals(second)){
                    resultAr.add(textA.get(i + 2));
                    a++;
                }
            }
        }
        String [] result = new String[resultAr.size()];
        
        for(int i = 0; i < resultAr.size(); i++){
            result[i] = resultAr.get(i);
        }
        
        for(int i = 0; i< result.length; i++){
            System.out.println(result[i]);
        }
        
        //return result;
        
        
    }
    
}
