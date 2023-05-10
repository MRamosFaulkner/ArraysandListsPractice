import java.util.Scanner;
import java.util.ArrayList;
public class HowLarge {
    public static void main(String[] args) {

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Create a list of String Array with user inputs
        ArrayList<String> largeList = new ArrayList<>();

        System.out.println("Add a string of items to you list.");
        System.out.println("Press enter to stop list and see how large your list is.");

        //
        while (true) {
            //Enters items to add to list
            String addedItems = scanner.nextLine();//reads info entered

            //If no item entered and enter pressed loop stops(empty)
            if (addedItems.isEmpty()) {
                break;
            }
            //Otherwise items added to array
            largeList.add(addedItems);
        }
        //If nothing else to enter
        int allItems = largeList.size();

        System.out.println("Total items in list: " + allItems);

    }
}
