/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author erens
 */
public class null575 {

    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 3};
        int eatLimit = candyType.length / 2;
        int result = 0;
        Set<Integer> uniqueCandies = new HashSet<>();
        for (int candy : candyType) {
            uniqueCandies.add(candy);
        }

        if (uniqueCandies.size() <= eatLimit) {
            result = uniqueCandies.size();
        } else {
            result = eatLimit;
        }

        System.out.println(result);
        //return result;
    }

}
