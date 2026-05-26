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
public class null561 {
    public static void main(String[] args) {
        int [] nums = {6,2,6,5,1,2};
        Arrays.sort(nums);
        
        int maxSum = 0;
        
       
        for (int i = 0; i < nums.length; i += 2) {
            maxSum += nums[i];
        }
        

        System.out.println("Max = " + maxSum);
        // return maxSum;
    }
    
}
