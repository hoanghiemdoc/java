package session14;

import java.util.Scanner;


public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ContactList contactList = new ContactList("0342988890");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\nEnter action (6  to show avadilable actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("\n shutting down..");
                    quit = true;
                    break;
                case 1:
                    contactList.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }

        }
    }

    private static void addNewContact() {
        System.out.println("enter your name");
        String name = scanner.nextLine();
        System.out.println("enter your number");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if (contactList.addNewContact(newContact)) {
            System.out.println("new contact add name = " + name +
                    "phone =" + phone);
        } else {
            System.out.println("canot add" + name + "aleardy on file");

        }
    }

    private static void updateContact() {
        System.out.println("enter exiting contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = contactList.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("contact not found");
            return;
        }
        if (contactList.removeContact(existingContactRecord)) {
            System.out.println("successfully delete");
        } else {
            System.out.println("error deleting contact");
        }

    }

    private static void removeContact() {
        System.out.println("enter your contact name");
        String name = scanner.nextLine();
        Contact existingContactRecord = contactList.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("contact not found");
            return;
        }
        if (contactList.removeContact(existingContactRecord)) {
            System.out.println("delete successfully");
        } else {
            System.out.println("error deleting contact");
        }
    }

    private static void queryContact() {
        System.out.println("enter sitting contact name");
        String name = scanner.nextLine();
        Contact existingContactRecord = contactList.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("contact not found");
            return;
        }
        System.out.println("name" + existingContactRecord.getName() + "" +
                "phone number is" + existingContactRecord.getPhoneNumber());
    }

    private static void startPhone() {
        System.out.println("starting phone");
    }

    private static void printActions() {
        System.out.println("\navailable actions\npress");
        System.out.println("0 - to shutdown\n"
                + "1 - to print contact\n "
                + "2 - add  to a new contact\n "
                + "3 -  to update exitting an exitting a new contact\n "
                + "4 -  to remove exitting an exitting a new contact\n "
                + "5 -  quety if an exitting contact exitting\n "
                + "6 -  to print an a list of available contact exitting\n ");
        System.out.println("chossen your action");
    }


}
