/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

/**
 *
 * @author erens
 */
public class null2000 {

    public static void main(String[] args) {
        String word = "abcdefh";
        char ch = 'd';
        String result = "";

        int targetPoint = word.indexOf(ch);

        String halfWord = word.substring(0, targetPoint + 1);

        if (targetPoint != -1) {
            StringBuilder sb = new StringBuilder(halfWord);
            String reverseHalfWord = sb.reverse().toString();
            int wordL = word.length();

            result = result + reverseHalfWord + word.substring(targetPoint + 1, wordL);

        } else {
            result = result + word;
        }

        System.out.println(result);

        // return result;
    }
}
