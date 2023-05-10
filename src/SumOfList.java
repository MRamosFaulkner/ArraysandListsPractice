import java.util.Scanner;
import java.util.ArrayList;
public class SumOfList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers to add. Enter 0 to stop.");

        //Loop for numbers entered, but zero stops it
        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            numbers.add(number);
        }

        //Calls second method and adds all of the numbers
        int addedNums = sumOfNums(numbers);
        System.out.println("The sum of that list is: " + addedNums);

    }

    public static int sumOfNums(ArrayList<Integer> numbers) {
        int addedNums = 0;

        for (int i = 0; i < numbers.size(); i++) {
            addedNums += numbers.get(i);
        }
        return addedNums;
    }
}
