package addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AdressBookMain {
    private static Map<String,AddressBook> addressBooks = new HashMap<>();
    public static void main(String[] args) {
        AddressBook a1 = new AddressBook();
        AddressBook a2 = new AddressBook();

        Contact c1 = new Contact("Purva", "Chavrekar", "Near Sai Mandir", "Roha", "Maharashtra", 402019, "7164883247", "purvachavrekar@gmail.com");
        Contact c2 = new Contact("Omkar", "Madhavi", "Jubilee Hills", "Panvel", "Maharashtra", 410340, "7845236291", "omkaemadhvi@gmail.com");
        Contact c3 = new Contact("Omkar", "Khade", "Visava Villa", "Banglore", "Karnataka", 493123, "9590595867", "pranjalkhade@gmail.com");
        Contact c4 = new Contact("Pranjal", "More", "Thane", "Mumbai", "Maharashtra", 571202, "9974095642", "pranjalmore@gmail.com");
        a1.addContact(c1);
        a1.addContact(c2);
        a1.addContact(c4);
        a1.updateContact(c3);
        a1.deleteContact(c1);
        a2.addContact(c1);
        a2.addContact(c2);
        addressBooks.put("book1",a1);
        addressBooks.put("book2",a2);
        AddressBook book2 = addressBooks.get("book2");
        Contact contact2 = book2.getContact(1);
        String book2Contact2SecondName = contact2.getLastName();
        System.out.println("Second Name of Second Contact From Second Book: "+book2Contact2SecondName);
        System.out.println("\n All Address books details");
        System.out.println("---------------------------");
        displayAddressBooks();
    }
    public static void displayAddressBooks() {
        Set<Map.Entry<String, AddressBook>> booksPair =addressBooks.entrySet();
        for (Map.Entry<String, AddressBook> bookPair : booksPair) {
            System.out.println(bookPair.getKey()+" : ");
            AddressBook book = bookPair.getValue();
            book.displayContacts();
        }




    }
}