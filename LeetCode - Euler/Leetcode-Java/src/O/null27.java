/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

import java.util.ArrayList;

/**
 *
 * @author erens
 */
public class null27 {

    public static void main(String[] args) {
        int nums[] = {3, 2, 2, 3};
        int val = 3;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }

        //return index; 
    }

}
