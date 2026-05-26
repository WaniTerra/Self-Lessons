/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package X;

/**
 *
 * @author erens
 */
public class null2566 {

    public static void main(String[] args) {
        int num = 909;

        String numStr = String.valueOf(num);
        int numLength = numStr.length();

        String bigNumber = "";
        String bigNumber2 = "";

        for (int i = 0; i < numLength - 1; i++) {

            if (numStr.charAt(i) <= numStr.charAt(i + 1) && numStr.charAt(i) != 0) {
                bigNumber = String.valueOf(numStr.charAt(i));
                break;
            }  else {
                bigNumber = String.valueOf(numStr.charAt(i));
            }
        }

        String num2String = numStr.replaceAll(bigNumber, "0");

        for (int i = 0; i < numLength - 1; i++) {

            if (numStr.charAt(i) <= numStr.charAt(i + 1) && numStr.charAt(i) != 9) {
                bigNumber2 = String.valueOf(numStr.charAt(i));
                break;
            } else {

                bigNumber2 = String.valueOf(numStr.charAt(numLength - 1));

            }
        }

        String num1String = numStr.replaceAll(bigNumber2, "9");

        int result = Integer.parseInt(num1String) - Integer.parseInt(num2String);

        System.out.println(num2String);
        //return result;

    }
}
