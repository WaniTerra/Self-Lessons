/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

/**
 *
 * @author erens
 */
public class null1O {

    public static void main(String[] args) {
        String s1 = "bnxw";
        String s2 = "bwxn";
        StringBuilder sb = new StringBuilder(s1);
        String mainS = "";
        if (sb.charAt(0) != s2.charAt(0)) {

            char temp = sb.charAt(0);
            sb.setCharAt(0, sb.charAt(2));
            sb.setCharAt(2, temp);
            

        }

        if (sb.charAt(1) != s2.charAt(1)) {
            char temp1 = sb.charAt(1);
            sb.setCharAt(1, sb.charAt(3));
            sb.setCharAt(3, temp1);
            

        }
        mainS = sb.toString();
        boolean result = false;

        if (mainS.equals(s2)) {
            result = true;
        }

        System.out.println(s2);
        System.out.println(mainS);
        System.out.println(result);
        //return result;

    }

}
