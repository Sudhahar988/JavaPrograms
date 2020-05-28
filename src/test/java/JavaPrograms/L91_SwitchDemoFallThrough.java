package JavaPrograms;

import java.util.Scanner;

public class L91_SwitchDemoFallThrough {

    public static void main(String[] args) {
    	
    	
        java.util.ArrayList<String> futureMonths =
            new java.util.ArrayList<String>();

        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the input value :");
        String monthVal=sc.next();
        int matInt=Integer.parseInt(monthVal);
        int month = matInt;

        switch (month) {
            case 1:  futureMonths.add("January");
            case 2:  futureMonths.add("February");
            case 3:  futureMonths.add("March");
            case 4:  futureMonths.add("April");
            case 5:  futureMonths.add("May");
            case 6:  futureMonths.add("June");
            case 7:  futureMonths.add("July");
            case 8:  futureMonths.add("August");
            case 9:  futureMonths.add("September");
            case 10: futureMonths.add("October");
            case 11: futureMonths.add("November");  
            case 12: futureMonths.add("December");
                     break;
            default: break;
        }

        if (futureMonths.isEmpty()) {
            System.out.println("Invalid month number");
        } else {
            for (String monthName : futureMonths) {
               System.out.println(monthName);
            }
        }
    }
}
