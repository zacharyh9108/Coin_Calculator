import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // This program calculates the value of the user input but using the fewest coins possible
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter an amount in dollars and cents: ");
        String userDollar = s.nextLine();
        double dollar = Double.parseDouble(userDollar);
        // Calculate the number of quarters, dimes, nickels, and pennies according to the number the user inputted
        int quarters = (int) (dollar * 100) / 25;
        // The program calculates the amount of money remaining
        double newDollar = dollar - quarters * 0.25;
        int dimes = (int) (newDollar * 100) / 10;
        // The program calculates the amount of money remaining
        double newerDollar = newDollar - dimes * 0.10;
        int nickels = (int) (newerDollar * 100) / 5;
        // The program calculates the amount of money remaining
        double newestDollar = newerDollar - nickels * 0.05;
        int pennies = (int) (newestDollar * 100);
        int numOfCoins = quarters + dimes + nickels + pennies;
        System.out.println();
        System.out.println("The amount of coins is: " + numOfCoins);
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");
    }
}