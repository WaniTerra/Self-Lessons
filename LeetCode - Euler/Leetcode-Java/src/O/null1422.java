/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

/**
 *
 * @author erens
 */
public class null1422 {

    public static void main(String[] args) {
        String s = "1111";
        System.out.println(maxScore(s));

    }

    public static int maxScore(String s) {
        String ss = s;
        int n = s.length();

        int max = 0;

        for (int i = 1; i < n; i++) {
            String sL = ss.substring(0, i);
            String sR = ss.substring(i);

            int tempM = 0;

            for (int j = 0; j < sL.length(); j++) {
                if (sL.charAt(j) == '0') {
                    tempM++;
                }
            }

            for (int j = 0; j < sR.length(); j++) {
                if (sR.charAt(j) == '1') {
                    tempM++;
                }

            }

            if (tempM > max) {
                max = tempM;
            }

        }
        return max;
    }

}
