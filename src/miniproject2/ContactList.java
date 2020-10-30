package miniproject2;

import java.util.ArrayList;

public class ContactList {
    ArrayList<Contact> contacts = new ArrayList<>() {};

    public ContactList(ArrayList contacts) {
        this.contacts = contacts;
    }

    public ArrayList getContacts() {
        return contacts;
    }

    public ContactList() {

    }

    public void addContact(Contact newContact) {
        contacts.add(newContact);
    }

    public void removeContact(int index) {
        contacts.remove(index);
    }

    public void updateContact(int index, String name, String mobile) {
        contacts.get(index).setName(name);
        contacts.get(index).setNumber(mobile);
    }
}