import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Example 1
        // Reading string from console input

        Scanner input = new Scanner(System.in);
        System.out.println("Enter three words separated by spaces: ");
        String name = input.next();
        String borough = input.next();
        int DOB = input.nextInt();

        System.out.println("My name is " + name);
        System.out.println("I live in The " + borough);
        System.out.println("I was born on " + DOB);


        //Example 2
        // reading a String from the console

        Scanner inputTwo = new Scanner(System.in);

        System.out.println("Enter a Character: ");
        String S = inputTwo.nextLine();
        char ch = S.charAt(4);

        System.out.println("The character entered is " + ch);

    }
}