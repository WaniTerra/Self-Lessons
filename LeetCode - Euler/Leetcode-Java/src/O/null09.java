/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

/**
 *
 * @author erens
 */
public class null09 {
    public static void main(String[] args) {
        int x = 121;
        
        boolean result = false;
        
        String xS = String.valueOf(x);
        StringBuilder sb = new StringBuilder(xS);
        String xSs= sb.reverse().toString();
        
        if (xSs.equalsIgnoreCase(xS)){
            result = true;
        }
        
        System.out.println(result);
        //return result;
        
    }
    
}
