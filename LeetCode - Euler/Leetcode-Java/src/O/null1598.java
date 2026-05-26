/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

/**
 *
 * @author erens
 */
public class null1598 {

    public static void main(String[] args) {

        String[] logs = {"./", "ho3/", "tl8/"};

        int down = 0;

        for (int i = 0; i < logs.length; i++) {
            if (logs[i].matches(".*[a-z1-9].*")) {
                down++;
            } else if (logs[i].equals("./")) {

            } else if (logs[i].equals("../")) {
                down--;
            }

            if (down < 0) {
                down = 0;
            }
        }

        System.out.println(down);
        //return down;

    }

}
