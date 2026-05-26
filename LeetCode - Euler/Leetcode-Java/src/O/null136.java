/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

/**
 *
 * @author erens
 */
public class null136 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 3, 4, 4};

        
        

        int numsL = nums.length;
        int result = 0;
        for (int i = 0; i < numsL; i++) {
            int same = 0;
            for (int a = 0; a < numsL; a++) {
                if (a == i) {
                    continue;
                }
                if (nums[i] != nums[a]) {
                    same++;
                }

            }
            if (-1 == (same - numsL)) {
                result = nums[i];
            }
        }
            System.out.println(result);
            //return result;
    }

}
