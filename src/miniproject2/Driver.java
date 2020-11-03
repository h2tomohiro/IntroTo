package miniproject2;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Tomohiro", "111-2222-3333", "Osaka", "", "");
        Contact contact2 = new Contact("Derrick Park", "222-2222-3333", "", "", "Takamatsu");
        Contact contact3 = new Contact("Taro", "333-2222-3333", "l", "Hakata", "");

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

        while (true) {
            System.out.println("Enter your option:");
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            String usernameInput = InputCollector.getUserInput(input);
            if (usernameInput.equals("5")) {
                System.exit(0);
            } else if (usernameInput.equals("1")) {
                for (int i = 0; i < contacts.getContacts().size(); i++) {
                    System.out.print(i);
                    System.out.println(contacts.getContacts().get(i).toString());
                }
            } else if (usernameInput.equals("2")) {
                System.out.println("Enter name:");
                String name = in.next();
                System.out.println("Enter mobile:");
                String mobile = in.next();
                System.out.println("Enter work:");
                String work = in.nextLine();
                System.out.println("Enter home:");
                String home = in.nextLine();
                System.out.println("Enter city:");
                String city = in.nextLine();
                Contact contact = new Contact(name, mobile, work, home, city);
                contacts.addContact(contact);
                System.out.println("Successfully added a new contract!");
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
                for (int i = 0; i < contacts.getContacts().size(); i++) {
                    System.out.print(i);
                    System.out.println(contacts.getContacts().get(i).toString());
                }
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
                    System.out.println("Enter work:");
                    String work = in.next();
                    System.out.println("Enter home:");
                    String home = in.next();
                    System.out.println("Enter city:");
                    String city = in.next();
                    contacts.updateContact(index, name, mobile, work, home, city);
                    System.out.println("Successfully update" + updatedName);
                }
            } else {
                System.out.println("Invalid Input. Enter number between 1 and 5");
            }
        }

    }
}