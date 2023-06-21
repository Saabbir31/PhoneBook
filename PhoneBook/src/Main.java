import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add contact");
            System.out.println("2. List contacts");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter phone number: ");
                        String phoneNumber = scanner.nextLine();
                        System.out.print("Enter country code: ");
                        String countryCode = scanner.nextLine();
                        System.out.print("Enter country: ");
                        String country = scanner.nextLine();
                        System.out.print("Enter email: ");
                        String email = scanner.nextLine();
                        System.out.print("Enter gender: ");
                        String gender = scanner.nextLine();

                        Contact contact = new Contact(name, phoneNumber, countryCode, country, email, gender);
                        phoneBook.addContact(contact);
                        break;
                    }catch (Exception e)
                    {
                        System.out.println("Input incorrect");
                    }
                case 2:
                    phoneBook.listContacts();
                    break;
                case 3:
                    System.out.println("Exiting Phone Book. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
    }
}