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
public class null1876 {

    public static void main(String[] args) {
        String s = "aababcabc";

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <= s.length() - 3; i++) {

            list.add(s.substring(i, i + 3));

        }
        int count = 0;
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).charAt(0) != list.get(i).charAt(1) && list.get(i).charAt(1) != list.get(i).charAt(2)
                    && list.get(i).charAt(0) != list.get(i).charAt(2) ) {
                count++;
            }

        }
        System.out.println(count);
        //return count;

    }

}
