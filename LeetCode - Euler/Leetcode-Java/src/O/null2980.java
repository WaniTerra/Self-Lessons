/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

/**
 *
 * @author erens
 */
public class null2980 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        int result = 0;
        
        StringBuilder binary = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {
            binary.delete(0, binary.length());
            while (nums[i] > 0) {
                binary.insert(0, nums[i] % 2); 
                nums[i] = nums[i] / 2; 
            }

            
            if (binary.length() == 0) {
                binary.append("0");
            }
            
            String word = binary.toString();
            
            if(word.charAt(binary.length() - 1) == '0'){
                result++;
            }
          
            System.out.println(binary.toString());
        }
        
        if(result >= 2){
            //return true;
        } else{
            //return false;
        }
        
        
        System.out.println(result);
        //Boş uzattık çift olan rakamların sonu 0 sadece. Onu saysak yeterdi.
        
    }

}

