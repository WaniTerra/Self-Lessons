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
public class nulll1827 {

    public static void main(String[] args) {

        int[] nums = {8};

        int times = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] >= nums[i + 1]) {
                int border = (nums[i] - nums[i + 1]);
                for (int j = 0; j <= border; j++) {
                    nums[i + 1]++;
                    times++;
                }
            }

        }

        System.out.println(Arrays.toString(nums));
        System.out.println(times);

        //return times;
    }

}
