/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author erens
 */
public class null976 {
    public static void main(String[] args) {
        
        int nums[] = {1,2,1,10};
        
        
        int result = 0;
        ArrayList<Integer> num = new ArrayList<Integer>();
         for(int i =0 ; i < nums.length; i++){
             num.add(nums[i]);
         }
        
        Collections.sort(num);
        
        for(int i =0 ; i < num.size(); i++){
            
            if(num.get(i) + num.get(i + 1) > num.get(i + 2)){
                
                result = num.get(i) + num.get(i + 1) + num.get(i + 2);
                
            }
            
            if(i + 3 >= num.size()){
                break;
            }
                
        }
        
        
        System.out.println(result);
        //return result;
        
        
        
    }
}
