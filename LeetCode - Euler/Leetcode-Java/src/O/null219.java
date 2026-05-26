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
public class null219 {

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 0, 0, 7, 8, 9, 10, 11, 12, 0};
        int k = 1;

        HashMap<Integer, Integer> map = new HashMap<>(); 
        boolean result = false;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int lastIndex = map.get(nums[i]);
                if (Math.abs(i - lastIndex) <= k) {
                    result = true;
                    break;
                }
            }
            
            map.put(nums[i], i);
        }

        System.out.println(result);
        //return result;

    }

}
