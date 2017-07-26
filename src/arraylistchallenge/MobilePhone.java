package arraylistchallenge;

import java.util.ArrayList;
import java.util.Objects;

public class MobilePhone {

    private ArrayList<Contact> contacts;
    private String[] options = {"1: Add new contact\n", "2: Print all contacts\n", "3: Update an existing contact\n", "4: Search a contact\n",
    "5: Delete a Contact\n", "6: Quit\n"};

    MobilePhone() {
        this.contacts = new ArrayList<Contact>();
    }

    private int findContact(Contact contact) {
        return this.contacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i = 0; i < this.contacts.size(); i++) {
            if (this.contacts.get(i).name.equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean storeContact(Contact contact) {

        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact already in phone!");
            return false;
        }
        contacts.add(contact);
        System.out.println("Contact successfully added");
        return true;
    }

    public boolean modifyContact(String oldName, String newNumber) {

        if (findContact(oldName) == -1) {
            System.out.println("Contact doesn't exist!");
            return false;
        } else {
            int index = findContact(oldName);
            Contact oldEntry = contacts.get(index);
            oldEntry.phoneNumber = newNumber;
            System.out.println("Contact updated successfully!");
            return true;
        }
    }


    public boolean queryContact(String data) {

        if (findContact(data) == -1) {
            System.out.println("Contact doesn't exist!");
            return false;
        } else {
            Contact contact = contacts.get(findContact(data));
            System.out.println(contact.toString());
            return true;
        }
    }

    public void showContacts() {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(i + 1 + ". " + contacts.get(i).toString());
        }
    }

    public boolean deleteContact(String contact) {

        if (findContact(contact) == -1) {
            System.out.println("Contact doesn't exist!");
            return false;
        } else {
            contacts.remove(findContact(contact));
            System.out.println("Contact deleted!");
            return true;
        }
    }

    public void showMenu() {
        System.out.println("Hi, what would you like to do?");
        for (int i = 0; i < options.length; i++) {
            System.out.print(options[i]);
        }
    }
}
