/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author erens
 */
public class null2099 {

    public static void main(String[] args) {
        int[] nums = {50, -75};
        int k = 2;

        ArrayList<Integer> numsA = new ArrayList<>();
        ArrayList<Integer> resultB = new ArrayList<>();
        int[] result = new int[k];

        for (int i = 0; i < nums.length; i++) {

            numsA.add(nums[i]);

        }

        Collections.sort(numsA, Collections.reverseOrder());

        for (int i = 0; i < k; i++) {

            resultB.add(numsA.get(i));

        }

        int index = 0;

       for (int i = 0; i < nums.length; i++) {
            if (resultB.contains(nums[i])) {
                result[index] = nums[i];
                index++;
                
                resultB.remove(Integer.valueOf(nums[i]));
            }
        }

        //return result;
    }

}
