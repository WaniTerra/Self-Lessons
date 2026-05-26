/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

/**
 *
 * @author erens
 */
public class null2710 {
    public static void main(String[] args) {
        String num = "0101015460000";
        int numL = num.length();
        
        
        for (int i = numL - 1 ; i >= 0 ; i--){
        
            char lastW = num.charAt(i);
            
            if (lastW == '0' ) {
                num = num.substring(0, i);
            } else {
                break;
            }
            
            
        }
        System.out.println(num);
        //return num;
        
    }
    
}
