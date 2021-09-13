import java.util.Calendar;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alex Fowler
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your current age? ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("At what age would you like to retire? ");
        int ret_age = Integer.parseInt(scanner.nextLine());
        System.out.println("You have " + (ret_age - age) + " years left until you can retire.");
        int cur_year = Calendar.getInstance().get(Calendar.YEAR);
        int ret_year = cur_year + (ret_age - age);
        System.out.print(String.format("It's %s, so you can retire in %s.",
                cur_year, ret_year));
    }
}
