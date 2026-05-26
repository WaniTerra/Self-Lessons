/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

/**
 *
 * @author erens
 */
public class null2833 {

    public static void main(String[] args) {
        String moves = "L_RL__R";
        int hL = 0;
        int hR = 0;
        int hX = 0;
        int m = 0;

        for (int i = 0; i < moves.length(); i++) {
            char currentChar = moves.charAt(i);
            if (currentChar == 'L') {
                hL++;
            } else if (currentChar == 'R') {
                hR++;
            } else if (currentChar == '_') {
                hX++;
            }
        }

        if (hL > hR) {

            m = (hL - hR) + hX;
        } else {
            m = (hR - hL) + hX;
        }

        System.err.println(m);
        //return m;

    }
}
