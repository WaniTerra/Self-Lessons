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
public class null645 {
    public static void main(String[] args) {
        int[] nums = {2, 2}; 
        int[] result = new int[2]; 

        
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
         
            if (nums[i] == nums[i + 1]) {
                result[0] = nums[i]; 
            }

           
            if (nums[i + 1] - nums[i] == 2) {
                result[1] = nums[i] + 1;
            }
        }

        
        if (nums[nums.length - 1] != nums.length) {
            result[1] = nums.length;
        }

        System.out.println(Arrays.toString(result)); 
        //retun result;
    }
    
}
