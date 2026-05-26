/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

/**
 *
 * @author erens
 */
public class null2255 {
    public static void main(String[] args) {
        
        String words[] = {"a","b","c","ab","bc","abc"};
        String s = "abc";
        
        int result = 0 ;
       
        for(int i = 0; i < words.length; i++){
            if(s.startsWith(words[i])){
                result++;
            }
        }
        
        
        System.out.println(result);
        //return result;
    }
    
}
