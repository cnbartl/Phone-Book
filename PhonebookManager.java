// Cooper Bartl
// CS 145
// 2/1/2024

// This method manages the phonebook with function like: create,
// edit, delete, print.

class PhonebookManager {
    private ListNode head;

    public PhonebookManager() {
        this.head = null;
    }

    // adds entry to the end of list
    public void addAtEnd(String firstName, String lastName, String address, String city, String phoneNumber) {
        ListNode newNode = new ListNode(firstName, lastName, address, city, phoneNumber);
        if (head == null) {
            head = newNode;
            return;
        }

        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    } // end of addAtEnd

    // print the current list
    public void printPhonebook() {
        ListNode current = head;
        int indexCount = 0;
        while (current != null) {
            System.out.println("Index: " +indexCount + ", Name: " + current.firstName +
                    " " + current.lastName +
                    ", Address: " + current.address +
                    ", City: " + current.city +

                    ", Phone: " + current.phoneNumber);
            current = current.next;
            indexCount++;
        }
    } // end of printPhonebook

    // edits an entry at specific index
    public void editEntry(int index, String firstName, String lastName, String address, String city, String phoneNumber) {
        ListNode current = head;

        for (int i = 0; i < index; i++) {
            if (current == null) {
                System.out.println("Invalid index");
                return;
            }
            current = current.next;
        }

        if (current != null) {
            current.firstName = firstName;
            current.lastName = lastName;
            current.address = address;
            current.city = city;
            current.phoneNumber = phoneNumber;
        } else {
            System.out.println("Invalid index");
        }
    } // end of editEntry()

    // deletes entry at specific index
    public void deleteEntry(int index) {
        if (head == null) {
            System.out.println("Phonebook is empty. Cannot delete entry.");
            return;
        }

        if (index == 0) {
            // Delete the first node
            head = head.next;
            System.out.println("Entry deleted successfully.");
            return;
        }

        ListNode current = head;
        ListNode previous = null;

        for (int i = 0; i < index; i++) {
            if (current == null) {
                System.out.println("Invalid index. Cannot delete entry.");
                return;
            }
            previous = current;
            current = current.next;
        }

        if (current != null) {
            // Delete the node at the specified index
            previous.next = current.next;
            System.out.println("Entry deleted successfully.");
        } else {
            System.out.println("Invalid index. Cannot delete entry.");
        }
    } // end of deleteEntry()
}
