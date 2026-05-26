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
public class null1816 {

    public static void main(String[] args) {

        String s = "Hello how are";
        int k = 3;

        System.out.println(truncateSentence(s, k));

    }

    public static String truncateSentence(String s, int k) {

        String[] sA = s.split(" ");
        String result = "";

        for (int i = 0; i < k; i++) {
            if (i == k - 1) {
                result += sA[i];
                break;
            }
            result += sA[i] + " ";
        }

        return result;

    }

}
