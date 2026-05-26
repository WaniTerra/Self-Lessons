/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

/**
 *
 * @author erens
 */
public class null1470 {
    public static void main(String[] args) {
        int [] nums = {1,1,2,2};
        int n = 2;
        
        int [] numsX = new int[nums.length];
        
        int a = 0;
         
        for (int i = 0 ; i<nums.length / 2; i++, a += 2, n++){
            numsX[a] = nums[i];
            numsX[a + 1] = nums[n];   
        }
        
        
        for (int i = 0; i < nums.length; i++) {
            System.out.println(numsX[i]);
        }
        
        //return numsX;
        
        
    }
    
}
