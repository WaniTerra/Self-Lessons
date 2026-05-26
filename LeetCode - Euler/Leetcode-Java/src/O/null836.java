/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

/**
 *
 * @author erens
 */
public class null836 {

    public static void main(String[] args) {
        int[] rec1 = {206110757,199595273,851054072,983256382};
        int[] rec2 = {-898677230,-47320317,-858614307,736177810};

        boolean a = true;

         if (rec1[2] <= rec2[0] || 
            rec1[0] >= rec2[2] || 
            rec1[3] <= rec2[1] || 
            rec1[1] >= rec2[3]) { 
            a = false;
        }

        System.out.println(a);
        //return a;

    }
}
