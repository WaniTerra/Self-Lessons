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
public class null2678 {

    public static void main(String[] args) {
        String[] details = {"1313579440F2036", "2921522980M5644"};
        ArrayList<Integer> ages = new ArrayList<>();

        for (int i = 0; i < details.length; i++) {
            String given = details[i];
            StringBuilder sb = new StringBuilder(given);

            String age = sb.substring(11, 13);
            int ageInt = Integer.parseInt(age);

            if (ageInt > 60) {
                ages.add(ageInt);
            }

        }

        System.out.println(ages.size());
        //return ages.size();

    }

}
