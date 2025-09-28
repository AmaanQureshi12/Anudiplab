/*
A phone directory holds a list of names with a phone number for each name. It is possible to find the number associated with a given name, and to specify the phone number for a given name. 

 [Hint:use a HashMap to store names as keys and phone numbers as values. The user can choose to find a number by providing a name or add a new name with a phone number. The program runs in a loop until the user chooses to exit.]
*/
package Lab4;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneDirectory {
    public static void main(String[] args) {
        HashMap<String, String> directory = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("📞 Welcome to the Phone Directory!");

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a new contact");
            System.out.println("2. Find a phone number");
            System.out.println("3. Exit");

            System.out.print("Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String number = scanner.nextLine();
                    directory.put(name, number);
                    System.out.println("✅ Contact saved!");
                    break;

                case 2:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    if (directory.containsKey(searchName)) {
                        System.out.println("📱 Phone number: " + directory.get(searchName));
                    } else {
                        System.out.println("❌ Contact not found.");
                    }
                    break;

                case 3:
                    running = false;
                    System.out.println("👋 Exiting Phone Directory. Goodbye!");
                    break;

                default:
                    System.out.println("⚠ Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}

/*
output: Welcome to the Phone Directory!

Choose an option:
1. Add a new contact
2. Find a phone number
3. Exit
Your choice: 1
Enter name: Amaan
Enter phone number: 6666506049
Contact saved!

Choose an option:
1. Add a new contact
2. Find a phone number
3. Exit
Your choice: 2
Enter name to search: Amaan
Phone number: 6666506049

Choose an option:
1. Add a new contact
2. Find a phone number
3. Exit
Your choice: 
*/
