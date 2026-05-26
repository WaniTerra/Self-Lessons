/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

/**
 *
 * @author erens
 */
public class null1991 {

    public static void main(String[] args) {
        int[] nums = {2,5};
        int result = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int resultLeft = 1000;
            int resultRight = 1000;
            for (int j = 0; j < nums.length; j++) {
                if (i < j) {
                    resultRight += nums[j];
                }
                if (i > j) {
                    resultLeft += nums[j];
                }
            }
            if (resultLeft == resultRight) {
                result = i;
                break;
            } else {
                result = -1;
            }
        }

        System.out.println(result);
        //return result;
    }

}
