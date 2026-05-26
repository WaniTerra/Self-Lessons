/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author erens
 */
public class null2815 {
    public static void main(String[] args) {
        int nums[] = {2536, 1613, 3366, 162};
        
        String bigNum[] = new String[nums.length];
        
     
        for(int i = 0; i < nums.length; i++){
            String numSt[] = String.valueOf(nums[i]).split("");
            Arrays.sort(numSt, Collections.reverseOrder());
            bigNum[i] = numSt[0] + "," + i;  
        }
     
        Arrays.sort(bigNum, Collections.reverseOrder());
        
        int use[] = new int[nums.length];
        int a = 0;
        
      
        for(int i = 0; i < bigNum.length - 1; i++){
            if(bigNum[i].charAt(0) == bigNum[i + 1].charAt(0)){
                int index1 = Integer.parseInt(bigNum[i].substring(2)); 
                int index2 = Integer.parseInt(bigNum[i + 1].substring(2)); 
                use[a] = nums[index1];
                use[a + 1] = nums[index2];
                a += 2;  
            } else {
                break;
            }
        }
        
   
        Integer[] useInteger = Arrays.stream(use).boxed().toArray(Integer[]::new);
        Arrays.sort(useInteger, Collections.reverseOrder());
     
        int result = -1;
        
      
        if(useInteger[0] != 0 && useInteger.length > 1) {
            result = useInteger[0] + useInteger[1];
        }

     
        System.out.println(result);
    }
}
