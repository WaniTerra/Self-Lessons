/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

import java.util.List;
import java.util.Arrays;

/**
 *
 * @author erens
 */
public class null2828 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("alice", "bob", "charlie");
        String s = "abc";

        String result = "";

        for (int i = 0; i < words.size(); i++) {
            result += words.get(i).substring(0, 1);
        }

        boolean result1 = result.equals(s);

        System.err.println(result1);
        //return result1;

    }
}
