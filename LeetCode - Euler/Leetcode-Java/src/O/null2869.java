/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author erens
 */
public class null2869 {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(1);
        int k = 2;

        ArrayList<Integer> targets = new ArrayList<>();
        for (int i = 1; i <= k; i++) {
            targets.add(i);
        }

        int tempMax = 0;
        int step = 0;

        for (int i = targets.size() - 1; i >= 0; i--) {
            step = 0;
            for (int j = nums.size() - 1; j >= 0; j--) {
                step++;

                if (targets.get(i) == nums.get(j)) {

                    if (step >= tempMax) {
                        tempMax = step;
                       targets.remove(Integer.valueOf(targets.get(i)));
                    } else {
                        
                    }
                    break;

                }

            }
        }

        System.out.println(tempMax);
        // return tempMax;

    }
}
