/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

/**
 *
 * @author erens
 */
public class null01 {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int result[] = new int[2];
        for(int i = 0; i < nums.length; i++ ){
            for (int j = 0; j < nums.length; j++){
                if (j == i){
                    continue;
                } else {
                    if(nums[i] + nums[j] == target){
                        result[0] = i;
                        result[1] = j;
                    }
                }
                
            }
        }
        
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
        //return result;
        
        
    }

}
