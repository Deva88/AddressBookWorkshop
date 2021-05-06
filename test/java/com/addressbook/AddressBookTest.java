package com.addressbook;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class AddressBookTest {

    @Test
    public void givenContactInAddressBookReturnTrue() {
        AddressBook addressBook = new AddressBook();
        ContactInfo contacts = new ContactInfo("Devendra", "Kumar", "Garkha", "Saran", "Bihar", 841311, 8123273639l, "deva@gmail.com");
        boolean result = addressBook.addContacts(contacts);
        Assertions.assertTrue(result);
    }
}