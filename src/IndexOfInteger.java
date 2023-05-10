import java.util.ArrayList;
import java.util.Scanner;
public class IndexOfInteger {
    public static void main(String[] args) {

        //Allows for input
        Scanner scanner = new Scanner(System.in);

        //Allows for array
        ArrayList<Integer> inputs = new ArrayList<>();

        System.out.println("Enter integers, one per line. Enter 0 to stop.");

        //Numbers are entered and added, but zero stops it
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            inputs.add(number);
        }

        //To show list of all numbers in array
        for (int i = 0; i < inputs.size(); i++) {
            System.out.println(inputs.get(i));

        }

        System.out.println("You are done adding integers to the list.");
        System.out.println("Which integer do you want to find the index of?");

        //For number picked and index location
        int numPicked = scanner.nextInt();
        int index = inputs.indexOf(numPicked);

        if (index == -1) {
            System.out.println("The integer " + numPicked + " is not in the list.");
        } else {
            System.out.println("The index of the integer " + numPicked + " is " + index);
        }
    }
}
