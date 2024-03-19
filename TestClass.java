// Cooper Bartl
// CS 145
// 2/1/2024

// This is the test method for PhonebookManager. It contains the main()
// with a user friendly menu

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        PhonebookManager phonebookManager = new PhonebookManager();
        Scanner scanner = new Scanner(System.in);

        String userChoice;

        System.out.println(4 - 6 * 2 + "1 + 3" + (7 % 4) + 6 / 4);
        

        do {
            System.out.println("Phonebook Menu:");
            System.out.println("c. Create a new entry");
            System.out.println("e. Edit an entry");
            System.out.println("d. Delete an entry");
            System.out.println("p. Print the phonebook");
            System.out.println("q. Quit");

            System.out.print("Enter your choice: ");
            userChoice = scanner.nextLine();

            switch (userChoice.toLowerCase()) {
                case "c":
                    // create a new entry
                    System.out.print("Enter first name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter last name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter city: ");
                    String city = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();

                    phonebookManager.addAtEnd(firstName, lastName, address, city, phoneNumber);
                    System.out.println("Entry added successfully!\n");
                    break;

                case "e":
                    // edit an entry
                    System.out.print("Enter the index of the entry to edit: ");
                    int indexToEdit = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Enter updated first name: ");
                    String updatedFirstName = scanner.nextLine();
                    System.out.print("Enter updated last name: ");
                    String updatedLastName = scanner.nextLine();
                    System.out.print("Enter updated address: ");
                    String updatedAddress = scanner.nextLine();
                    System.out.print("Enter updated city: ");
                    String updatedCity = scanner.nextLine();
                    System.out.print("Enter updated phone number: ");
                    String updatedPhoneNumber = scanner.nextLine();

                    phonebookManager.editEntry(indexToEdit, updatedFirstName, updatedLastName, updatedAddress, updatedCity, updatedPhoneNumber);
                    System.out.println("Entry edited successfully!\n");
                    break;

                case "p":
                    // print the phonebook
                    System.out.println("Phonebook Entries:");
                    phonebookManager.printPhonebook();
                    break;

                case "d":
                    // delete an entry
                    System.out.print("Enter the index of the entry to delete: ");
                    int indexToDelete = scanner.nextInt();
                    scanner.nextLine(); 
                    phonebookManager.deleteEntry(indexToDelete);

                case "q":
                    // quit the program
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.\n");
            }
        } while (!userChoice.toLowerCase().equals("q"));

        scanner.close();
    }
}