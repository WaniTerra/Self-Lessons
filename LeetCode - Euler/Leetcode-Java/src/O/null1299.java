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
public class null1299 {

    public static void main(String[] args) {

        int[] arr = {17, 18, 5, 4, 6, 1};
        int[] arr2 = replaceElements(arr);

        System.out.println(Arrays.toString(arr2));

    }

    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int max = -1; 

        
        for (int i = n - 1; i >= 0; i--) {
            result[i] = max;
            max = Math.max(max, arr[i]); 
        }

        return result;
    }

}
