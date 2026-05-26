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
public class null2013 {

    public static void main(String[] args) {
        String rings = "B0R0G0R9R0B0G0";

        ArrayList<String> pieceRingB = new ArrayList<>();
        ArrayList<String> pieceRingA = new ArrayList<>();

        for (int i = 0; i < rings.length(); i += 2) {
            String onePiece = rings.substring(i, i + 2);
            pieceRingB.add(onePiece);
        }

        for (String repeat : pieceRingB) {
            if (!pieceRingA.contains(repeat)) {
                pieceRingA.add(repeat);
            }

        }

        ArrayList<String> rRing = new ArrayList<>();
        ArrayList<String> gRing = new ArrayList<>();
        ArrayList<String> bRing = new ArrayList<>();

        int result = 0;

        for (int i = 0; i < pieceRingA.size(); i++) {
            char color = pieceRingA.get(i).charAt(0);
            char rod = pieceRingA.get(i).charAt(1);
            if (color == 'R') {
                rRing.add(String.valueOf(rod));
            }
            if (color == 'G') {
                gRing.add(String.valueOf(rod));
            }
            if (color == 'B') {
                bRing.add(String.valueOf(rod));
            }
        }

        for (String rod : bRing) {
            if (gRing.contains(rod) && rRing.contains(rod)) {
                result++;
            }
        }

        System.out.println(result);
        //return result;
    }

}
