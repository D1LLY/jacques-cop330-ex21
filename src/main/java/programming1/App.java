/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dilly Jacques
 */

/*
Example Output
Please enter the number of the month: 3
The name of the month is March.
 */

package programming1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Please enter the number of the month: ");
        int num= in.nextInt();

        String out="";
        String month="";

        switch(num){
            case 1:
                month="January";
                break;
            case 2:
                month="February";
                break;
            case 3:
                month="March";
                break;
            case 4:
                month="April";
                break;
            case 5:
                month="May";
                break;
            case 6:
                month="June";
                break;
            case 7:
                month="July";
                break;
            case 8:
                month="August";
                break;
            case 9:
                month="September";
                break;
            case 10:
                month="October";
                break;
            case 11:
                month="November";
                break;
            case 12:
                month="December";
                break;
            default:
                out="Invalid input";

        }
        if(!out.equals("Invalid input")){
            out="The name of the month is "+month;
        }
        System.out.println(out);
    }
}
