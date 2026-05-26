/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

/**
 *
 * @author erens
 */
public class null1460 {
    public static void main(String[] args) {
        int[] target  = {1,1,1,1};
        int [] arr = {1,1,1,1};
        boolean result = true;
        
        for (int i = 0; i < target.length; i++) {
             boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                
                if (target[i] == arr[j]){
                    found = true;
                    arr[j] = 0;
                    break;
                }
                
            }
            if (!found) { 
                    result = false;
                    break;
                }
        }
        
        System.out.println(result);
        // return result;
    }
    
}
