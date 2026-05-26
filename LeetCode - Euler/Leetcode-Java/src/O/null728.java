/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author erens
 */
public class null728 {

    public static void main(String[] args) {
        int right = 22;
        int left = 1;
        List<Integer> result = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            String num = String.valueOf(i);  
            boolean isSelfDividing = true;   

            
            for (char a : num.toCharArray()) {
                if (Character.getNumericValue(a) == 0) {
                    isSelfDividing = false;  
                    continue;
                }
                if (i % Character.getNumericValue(a) != 0) {
                    isSelfDividing = false;  
                    continue;  
                }
            }

            
            if (isSelfDividing) {
                result.add(i);
            }
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
        //return result;

    }

}
