import java.util.Scanner;
import java.util.ArrayList;
public class FifthItem {
    public static void main(String[] args) {

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Create a list of String Array with user inputs
        ArrayList<String> inputs = new ArrayList<>();
        System.out.println("Add a string of items to you list.(Press enter to stop)");

        //Loop that will stop only when empty/enter pressed
        while (true) {
            String items = scanner.nextLine();//reads info entered

            if (items.isEmpty()) {//If enter is pressed or "empty" loop stops
                break;
            }
            inputs.add(items);//Adds items/strings
        }

        //If at least 5 items on list it will list the fifth one, if not other message
        if (inputs.size() >=5) {
            System.out.println("Your fifth item on the list is:  " + inputs.get(4));//Gets the item specified
        } else {
            System.out.println("Need at least five items on the list.");
        }
    }
}
