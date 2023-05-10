import java.util.ArrayList;
import java.util.Scanner;
public class LastItem {
    public static void main(String[] args) {

        //Allows for input
        Scanner scanner = new Scanner(System.in);

        //Allows for array
        ArrayList<String> lastOne = new ArrayList<>();

        System.out.println("Add a string of items to your list.");
        System.out.println("Press enter to stop and see what your last item is.");

        while (true) {
            //Enters items to add to list .. reads info entered
            String itemsAdded = scanner.nextLine();

            //If enter is pressed or "empty" loop stops
            if (itemsAdded.isEmpty()) {
                break;
            }
            //Otherwise, add things to array
            lastOne.add(itemsAdded);
        }

        //If nothing else to enter
        if (lastOne.isEmpty()) {
            System.out.println("");
        //Then show last item
        } else {
            String lastItem = lastOne.get(lastOne.size() -1);
            System.out.println("The last item on your list is: " + lastItem);
        }
    }
}
