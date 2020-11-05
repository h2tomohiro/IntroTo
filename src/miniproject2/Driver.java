package miniproject2;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Tomohiro Meo", "111-2222-3333", "333-4444-5555", "6666-7777-8888", "Hakata");
        Contact contact2 = new Contact("Derrick Park", "333-4444-5555", "111-2222-3333", "6666-7777-8888", "Takamatsu");
        Contact contact3 = new Contact("Taro Yamada", "6666-7777-8888", "333-4444-5555", "111-2222-3333", "Namba");

        ContactList contacts = new ContactList();
        contacts.addContact(contact1);
        contacts.addContact(contact2);
        contacts.addContact(contact3);

        while (true) {

            System.out.println("+---- Contact App ----+");
            System.out.println("|1. List all Contacts |");
            System.out.println("|2. Add new Contact   |");
            System.out.println("|3. Remove Contact    |");
            System.out.println("|4. Update Contact    |");
            System.out.println("|5. Quit              |");
            System.out.println("+---------------------+");

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
                String name;
                while (true) {
                    System.out.println("Enter name:");
                    name = in.nextLine();
                    if (("").equals(name)) {
                        System.out.println("you must enter this field");
                    } else {
                        break;
                    }
                }
                String mobile;
                while (true) {
                    System.out.println("Enter mobile:");
                    mobile = in.nextLine();
                    if (("").equals(mobile)) {
                        System.out.println("you must enter this field");
                    } else {
                        break;
                    }
                }
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
                if (index > contacts.getContacts().size() - 1 || index < 0) {
                    System.out.println("Invalid number");
                } else {
                    String name = in.nextLine();
                    while (true) {
                        System.out.println("Enter name:");
                        name = in.nextLine();
                        if (("").equals(name)) {
                            System.out.println("you must enter this field");
                        } else {
                            break;
                        }
                    }
                    String mobile = in.nextLine();
                    while (true) {
                        System.out.println("Enter mobile:");
                        mobile = in.nextLine();
                        if (("").equals(mobile)) {
                            System.out.println("you must enter this field");
                        } else {
                            break;
                        }
                    }
                    System.out.println("Enter work:");
                    String work = in.nextLine();
                    System.out.println("Enter home:");
                    String home = in.nextLine();
                    System.out.println("Enter city:");
                    String city = in.nextLine();
                    contacts.updateContact(index, name, mobile, work, home, city);
                    System.out.println("Successfully update");
                }
            } else {
                System.out.println("Invalid Input. Enter number between 1 and 5");
            }
        }
    }
}