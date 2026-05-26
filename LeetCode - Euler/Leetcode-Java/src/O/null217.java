/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

import java.util.HashMap;

/**
 *
 * @author erens
 */
public class null217 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (Integer a : nums) {
            if (map.containsKey(a)){
                //map.put(a, map.get(a)+1);
                //return true;
            } else{
                map.put(a, 1);
            }
        }
         //return false;
        
    }
    
}
