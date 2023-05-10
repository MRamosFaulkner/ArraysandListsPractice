import java.util.ArrayList;
import java.util.Scanner;
public class tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();

        System.out.println("Enter integers, one per line. Enter 0 to stop.");

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (number == 0) {
                System.out.println("You are done adding integers to the list.");
                break;
            }

            inputs.add(number);
        }

        System.out.println("The integers you entered are:");
        for (int i = 0; i < inputs.size(); i++) {
            System.out.println(inputs.get(i));
        }

        System.out.println("Which integer do you want to find the index of?");
        int target = scanner.nextInt();

        int index = inputs.indexOf(target);

        if (index == -1) {
            System.out.println("The integer " + target + " is not in the list.");
        } else {
            System.out.println("The index of the integer " + target + " is " + index);
        }
    }
}
