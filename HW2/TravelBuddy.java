/*In order to help learn course concepts, I consulted related material
that can be found at https://www.w3schools.com/java/java_try_catch.asp .*/

import java.util.Scanner;
import java.text.NumberFormat;

public class TravelBuddy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        double cost = 0;
        String name = "";
        String destination = "";
        String answer = "";

        System.out.print("Welcome to Travel Buddy Service! Please enter your name here: ");
        name = scan.nextLine();
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.print("The Hive - $6.00\nInvention Studio - $7.50\nKlaus - $6.90\nCULC - $3.20"
            + "\n\nWhere would you like to go, " + name + "? \n");
        destination = scan.nextLine();

        switch (destination) {
        case "The Hive":
            cost = 6.00;
            break;
        case "Invention Studio":
            cost = 7.50;
            break;
        case "Klaus":
            cost = 6.90;
            break;
        case "CULC":
            cost = 3.20;
            break;
        default:
            System.out.println("That destination is invalid, goodbye!");
            scan.close();
            return;
        }

        if (destination.equals("Klaus") || destination.equals("CULC")) {
            System.out.println("Would you like to stop by Chick-fil-A on the way? (Yes/No)");
            answer = scan.nextLine();
            if (answer.equals("Yes")) {
                cost *= 1.5;
            } else if (!answer.equals("No")) {
                scan.close();
                return;
            }
        }
        System.out.println("Your current total is " + fmt.format(cost));
        System.out.println("Do you have a discount? (Yes/No)");
        answer = scan.nextLine();
        if (answer.equals("Yes")) {
            System.out.println("What is your discount code?");
            answer = scan.nextLine();
            if (answer.equals("CS1331")) {
                cost *= 0.75;
                System.out.println("You have received 25% off your ride!");
            } else if (answer.equals("IKNOWTHEOWNER")) {
                System.out.println("How much would you like to take off?");
                try {
                    double discount = scan.nextDouble();
                    cost -= discount;
                    System.out.println("Taking off " + fmt.format(discount) + " from your total...");
                } catch (Exception e) {
                    cost -= 1;
                }
            } else {
                System.out.println("That discount code does not exist! Better luck next time!");
                scan.close();
                return;
            }
        } else if (!answer.equals("No")) {
            scan.close();
            return;
        }

        if (cost < 0) {
            cost = 0;
        }

        System.out.println("Thank you for riding with the Travel Buddy Service, " + name + "! You are now "
            + fmt.format(cost) + " poorer! We hope you ride with us again! :)");
        scan.close();

    }
}
