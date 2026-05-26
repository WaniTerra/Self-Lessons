/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

/**
 *
 * @author erens
 */
public class null2591 {
    public static void main(String[] args) {
        int money = 20;
        int children = 3;
        
        if (money < children) {
            System.out.println(-1);
        }

        money -= children;
        int maxEightDollars = Math.min(money / 7, children); 

        
        if ((money % 7 == 3) && (maxEightDollars == children - 1)) {
            maxEightDollars -= 1;
        }

        System.out.println(maxEightDollars);
       
    
    }
    
}
