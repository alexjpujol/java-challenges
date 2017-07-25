package arraylistchallenge;

import java.util.ArrayList;
import java.util.Objects;

public class MobilePhone {

    private ArrayList<Contact> contacts = new ArrayList<Contact>();
    private String[] options = {"1: Add new contact\n", "2: Print all contacts\n", "3: Update an existing contact\n", "4: Search a contact\n",
    "5: Delete a Contact\n", "6: Quit\n"};

    public void storeContact(String name, String phoneNumber) {
        Contact contact = new Contact(name, phoneNumber);
        contacts.add(contact);
        System.out.println("Contact successfully added");
    }

    public void modifyContact(String contact, String newData) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact temp = contacts.get(i);
            if (Objects.equals(temp.name, contact) || Objects.equals(temp.phoneNumber, contact)) {
                contacts.get(i).phoneNumber = newData;
                System.out.println("Contact modified!");
                return;
            }
        }
        System.out.println("That contact doesn't exist!");
    }


    public void queryContact(String data) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact temp = contacts.get(i);
            if (Objects.equals(temp.name, data) || Objects.equals(temp.phoneNumber, data)) {
                System.out.println(temp.toString());
                return;
            }
        }
        System.out.println("That contact doesn't exist!");
    }

    public void showContacts() {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(i + 1 + ". " + contacts.get(i).toString());
        }
    }

    public void deleteContact(String contact) {
        for (int i = 0; i < contacts.size(); i++) {
            if (Objects.equals(contacts.get(i).name, contact)) {
                contacts.remove(i);
                System.out.println("Contact deleted!");
                return;
            }
        }
        System.out.println("That contact doesn't exist!");
    }

    public void showMenu() {
        System.out.println("Hi, what would you like to do?");
        for (int i = 0; i < options.length; i++) {
            System.out.print(options[i]);
        }
    }
}
