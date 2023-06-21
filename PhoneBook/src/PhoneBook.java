import javax.annotation.processing.FilerException;
import java.util.ArrayList;
import java.util.List;
class PhoneBook extends Display{
    private List<Contact> contacts;
    public PhoneBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    public void listContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Phone book is empty.");
        } else {
            System.out.println("Phone book contacts:");
            for (Contact contact : contacts) {
                System.out.println("Name: " + contact.getName());
                System.out.println("Phone number: " + contact.getCountryCode() + " " + contact.getPhoneNumber());
                System.out.println("Country: " + contact.getCountry());
                System.out.println("Email: " + contact.getEmail());
                System.out.println("Gender: " + contact.getGender());
                System.out.println("---------------------------------------");
            }
        }
    }

    @Override
    public void display() throws FilerException {
        userError();
    }
}