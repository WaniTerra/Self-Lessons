/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

/**
 *
 * @author erens
 */
public class null58 {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        
        s = s.trim();
        int last = s.lastIndexOf(" ");
        String lastW = s.substring(last + 1);
       
        System.out.println(lastW.length());
        //return lastW.length();
        
        
    }
    
}
