/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author erens
 */
public class null2441 {
    public static void main(String[] args) {
        int[] nums = {-25,25,-27,45,31,46,46,21};
        
        ArrayList<Integer> minus = new ArrayList<>();
        ArrayList<Integer> positive = new ArrayList<>();
        
        
        for(int a = 0; a < nums.length; a++){
            if(nums[a] < 0){
                minus.add(nums[a]);
            }
        }
        
        for(int a = 0; a < nums.length; a++){
            if(nums[a] > 0){
                positive.add(nums[a]);
            }
        }
       
        Collections.sort(positive, Collections.reverseOrder());
       
        for(int i = 0; i < positive.size() ; i++){
            for(int j = 0; j < minus.size() ; j++){
                if(positive.get(i) == Math.abs(minus.get(j))){
                    //return positive.get(i);
                    System.out.println(positive.get(i));
                }
            }    
        }
        System.out.println(-1);
        //return -1;
     
    }
    
}
