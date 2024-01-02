package addressbook;

public class AdressBookMain {
    public static void main(String[] args) {

        Contact c1 = new Contact("Purva", "Chavrekar", "Near Sai Mandir", "Roha", "Maharastra", 402019, "7164883247", "purvachavrekar@gmail.com");
        Contact c2 = new Contact("Omkar", "Madhavi", "Jubilee Hills", "Panvel", "Maharastra", 410340, "7845236291", "omkaemadhvi@gmail.com");
        Contact c3 = new Contact("Pranjal", "Khade", "Visava Villa", "Banglore", "Karnataka", 493123, "9590595867", "pranjalkhade@gmail.com");
        AddressBook a1 = new AddressBook();

        a1.addContact(c1);
        a1.addContact(c2);
        a1.displayContacts();



    }
}