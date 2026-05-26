/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O;

/**
 *
 * @author erens
 */
public class null1507 {

    public static void main(String[] args) {
        String date = "20th Oct 2052";

        String dateS[] = date.split(" ");
        String monNum = "0";
        switch (dateS[1]) {
            case "Jan":
                monNum = "01";
                break;
            case "Feb":
                monNum = "02";
                break;
            case "Mar":
                monNum = "03";
                break;
            case "Apr":
                monNum = "04";
                break;
            case "May":
                monNum = "05";
                break;
            case "Jun":
                monNum = "06";
                break;
            case "Jul":
                monNum = "07";
                break;
            case "Aug":
                monNum = "08";
                break;
            case "Sep":
                monNum = "09";
                break;
            case "Oct":
                monNum = "10";
                break;
            case "Nov":
                monNum = "11";
                break;
            case "Dec":
                monNum = "12";
                break;
        }
        String result = "";
        if (Character.isDigit(dateS[0].charAt(1))) {
            result = dateS[2] + "-" + monNum + "-" + dateS[0].substring(0, 2);
        } else {
            result = dateS[2] + "-" + monNum + "-" + "0" + dateS[0].substring(0, 1);
        }

        System.out.println(result);
        //return result;

    }

}
