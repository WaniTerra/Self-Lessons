/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

/**
 *
 * @author erens
 */
public class null1716 {

    public static void main(String[] args) {
        int n = 4;

        int daycheck = 7;

        if (n <= 7) {
            daycheck = n;
        }

        int week = n / 7;
        int weekcheck = 0;

        int day = n % 7;
        int result = 0;

        for (int i = 1, j = 1, a = 1; j <= daycheck; i++, j++) {
            result += i;
            System.out.println(i);

            if (j == daycheck) {
                j = 0;
                i = a;
                a++;

                if (weekcheck == week - 1) {
                    daycheck = day;

                }
                if (weekcheck == week) {
                    break;

                }

                weekcheck++;

            }
        }

        System.out.println(result);
        //return result;

    }
}
