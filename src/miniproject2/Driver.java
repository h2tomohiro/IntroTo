package miniproject2;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Yuki", "111-2222-3333");
        Contact contact2 = new Contact("Derrick", "222-2222-3333");
        Contact contact3 = new Contact("Steve", "333-2222-3333");

        ContactList contacts = new ContactList();
        contacts.addContact(contact1);
        contacts.addContact(contact2);
        contacts.addContact(contact3);

        System.out.println("+---- Contact App ----+");
        System.out.println("|1. List all Contacts |");
        System.out.println("|2. Add new Contact   |");
        System.out.println("|3. Remove Contact    |");
        System.out.println("|4. Update Contact    |");
        System.out.println("|5. Quit              |");
        System.out.println("+---------------------+");

        while(true) {
            System.out.println("Enter your option:");
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            String usernameInput = InputCollector.getUserInput(input);
            if (usernameInput.equals("5")) {
                System.exit(0);
            } else if (usernameInput.equals("1")) {
                System.out.println(usernameInput);
                for (int i = 0; i < contacts.getContacts().size(); i++) {
                    System.out.print(i);
                    System.out.println(contacts.getContacts().get(i).toString());
                }
            } else if (usernameInput.equals("2")) {
                System.out.println("Enter name:");
                String name = in.nextLine();
                System.out.println("Enter mobile:");
                String mobile = in.nextLine();
                Contact contact = new Contact(name, mobile);
                contacts.addContact(contact);
            } else if (usernameInput.equals("3")) {
                System.out.println("Enter the index of the contact to remove:");
                int index = in.nextInt();
                if (index > contacts.getContacts().size() || index < 0) {
                    System.out.println("Invalid number");
                } else {
                    Object removedName = contacts.getContacts().get(index);
                    contacts.removeContact(index);
                    System.out.println("Successfully removed" + removedName);
                }
            } else if (usernameInput.equals("4")) {
                System.out.println("Enter the index of the contact to update:");
                int index = in.nextInt();
                if (index > contacts.getContacts().size() || index < 0) {
                    System.out.println("Invalid number");
                } else {
                    Object updatedName = contacts.getContacts().get(index);
                    System.out.println("Enter name:");
                    String name = in.next();
                    System.out.println("Enter mobile:");
                    String mobile = in.next();
                    contacts.updateContact(index, name, mobile);
                    System.out.println("Successfully update " + updatedName);
                }
            }
        }

    }
}