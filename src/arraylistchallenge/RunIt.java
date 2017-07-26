package arraylistchallenge;

import java.util.Scanner;

public class RunIt {

    static Scanner scanner = new Scanner(System.in);
   // static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {

        MobilePhone mobilePhone = new MobilePhone();

        mobilePhone.queryContact("baba");
        mobilePhone.showContacts();

        boolean quit = false;

        while (!quit) {

            mobilePhone.showMenu();

            int selection = scanner.nextInt();
            scanner.nextLine();

            switch (selection) {
                case 1:
                    System.out.println("Enter a name:");
                    String name = scanner.next();
                    scanner.nextLine();
                    System.out.println("Now enter the number:");
                    String number = scanner.next();
                    Contact contact1 = new Contact(name, number);
                    mobilePhone.storeContact(contact1);
                    break;
                case 2:
                    mobilePhone.showContacts();
                    break;
                case 3:
                    System.out.println("Enter the name of the contact to update:");
                    String updateName = scanner.next();
                    scanner.nextLine();
                    System.out.println("Ok, now enter the new number!");
                    String updateNumber = scanner.next();
                    scanner.nextLine();
                    mobilePhone.modifyContact(updateName, updateNumber);
                    break;
                case 4:
                    System.out.println("Enter the name of the contact to search:");
                    String search = scanner.next();
                    scanner.nextLine();
                    mobilePhone.queryContact(search);
                    break;
                case 5:
                    System.out.println("Enter the name of the contact to delete:");
                    String delete = scanner.next();
                    scanner.nextLine();
                    mobilePhone.deleteContact(delete);
                    break;
                case 6:
                    System.out.println("Quitting!");
                    quit = true;
            }
        }

    }

}
