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
public class null2894 {

    public static void main(String[] args) {
        int n = 5;
        int m = 1;
        int num1 = 0; //cant
        int num2 = 0; //can

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            numbers.add(i);

        }

        //can
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % m == 0) {

                num2 += numbers.get(i);

            } else {
                num1 += numbers.get(i);
            }
            
        }
        int result = (num1 - num2);
        System.out.println(result);
        //return result;
        
    }

}
