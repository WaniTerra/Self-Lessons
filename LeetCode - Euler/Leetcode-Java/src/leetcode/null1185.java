/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetcode;

import java.time.LocalDate;

/**
 *
 * @author erens
 */
public class null1185 {
    public static void main(String[] args) {
        int day = 18, month = 7, year = 1999;
         LocalDate date = LocalDate.of(year, month, day);
         System.out.println(date.getDayOfWeek());
         
         String result = "";
         
         switch(date.getDayOfWeek().toString()){
             case "SUNDAY" : result =  "Sunday"; break;
             case "MONDAY" : result = "Monday"; break;
             case "TUESDAY" : result = "Tuesday"; break;
             case "WEDNESDAY" : result = "Wednesday";  break;
             case "THURSDAY" : result = "Thursday"; break;
             case "FRIDAY" : result = "Friday"; break;
             case "SATURDAY" : result = "Saturday"; break;
         }
         //return result;
         
        //return date.getDayOfWeek();
    }
}
