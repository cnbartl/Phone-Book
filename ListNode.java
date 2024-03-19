// Cooper Bartl
// CS 145
// 2/1/2024

// This method creates each entry for the phonebook.
// It takes in first and last name, address, city and phone number.

class ListNode {
    String firstName;
    String lastName;
    String address;
    String city;
    String phoneNumber;
    ListNode next;

    // updated constructor with five parameters
    public ListNode(String firstName, String lastName, String address, String city, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.next = null;
    }
}
