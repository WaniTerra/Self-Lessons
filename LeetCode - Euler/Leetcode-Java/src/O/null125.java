/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

/**
 *
 * @author erens
 */
public class null125 {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean result = false;

        String step2 = s.replaceAll("[^a-zA-Z0-9]", "");
        String step3 = step2.replace(" ", "").toLowerCase();

        StringBuilder sb = new StringBuilder(step3);

        String sReverse = sb.reverse().toString();

        if (sReverse.equals(step3)) {
            result = true;
        }

        System.out.println(result);
        // return result;

    }
}
