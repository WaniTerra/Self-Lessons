/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

/**
 *
 * @author erens
 */
public class null1013 {

    public static void main(String[] args) {
        int[] arr = {1, -1, 1, -1};
        System.out.println(canThreePartsEqualSum(arr));
    }

    public static boolean canThreePartsEqualSum(int[] arr) {
        int totalSum = 0;

        for (int num : arr) {
            totalSum += num;
        }

        if (totalSum % 3 != 0) {
            return false;
        }

        int target = totalSum / 3;
        int currentSum = 0;
        int partitions = 0;

        for (int num : arr) {
            currentSum += num;

            if (currentSum == target) {
                partitions++;
                currentSum = 0;
            }

            if (partitions == 3) {
                return true;
            }
        }

        return false;
    }
}
