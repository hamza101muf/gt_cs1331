/*I worked on the homework assignment alone, using only course materials.*/
import java.util.Scanner;

public class Giveaway {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] inventory = new String[5][5];
        int exit = 0;
        boolean hasStuff = false;
        for (int r = 0; r < inventory.length; r++) {
            for (int c = 0; c < inventory[r].length; c++) {
                inventory[r][c] = "x";
            }
        }
        inventory[0][2] = "StuffedPython";
        inventory[0][4] = "CSalt";
        inventory[1][0] = "hAIrspray";
        inventory[2][3] = "JavaBeans";
        inventory[3][1] = "RustedMetal";
        inventory[3][2] = "SwiftShoes";
        inventory[4][0] = "FuRniture";
        inventory[4][3] = "GroovyGear";
        inventory[4][4] = "RadiantRuby";

        System.out.print("\nWelcome to the 1331 Giveaway!\n");

        while (exit == 0) {
            hasStuff = false;
            for (int r = 0; r < inventory.length; r++) {
                for (int c = 0; c < inventory[r].length; c++) {
                    if (!inventory[r][c].equals("x")) {
                        hasStuff = true;
                    }
                }
            }
            if (!hasStuff) {
                System.out.println("Sorry, we have no more items!");
                scan.close();
                return;
            }
            System.out.println("\nWould you like to take an item? [Y]es, "
                    + "[N]o, or [E]xit");
            String answer = scan.nextLine();
            if (answer.equals("N")) {
                System.out.println("\nNext person in line!");
            } else if (answer.equals("E")) {
                System.out.println("Have a good day!");
                scan.close();
                return;
            } else if (answer.equals("Y")) {
                boolean select = true;
                printInventory(inventory);
                while (select) {
                    System.out.println("\nWhich item are you interested in taking?");
                    String position = scan.nextLine();
                    int row = position.charAt(0) - 48;
                    int col = position.charAt(2) - 48;
                    if (row > 4 || col > 4 || row < 0 || col < 0) {
                        System.out.println("\nLocation does not exist");
                    } else if (inventory[row][col].equals("x")) {
                        System.out.println("\nThere is no item in this location.");
                    } else {
                        System.out.println("\nYou successfully took the " + inventory[row][col] + "!");
                        inventory[row][col] = "x";
                        printInventory(inventory);
                        select = false;
                    }
                }
            } else {
                System.out.println("\nPlease input 'Y', 'N', or 'E'.");
            }
        }

        scan.close();
    }

    public static void printInventory(String[][] inventory) {
        System.out.println();
        for (int r = 0; r < inventory.length; r++) {
            System.out.print("|");
            for (int c = 0; c < inventory[r].length; c++) {
                System.out.print(inventory[r][c] + "|");
            }
            System.out.println();
        }
    }
}
