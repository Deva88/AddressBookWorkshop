package com.addressbook;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AddressBookTest {

    @Test
    public void givenContactInAddressBookReturnTrue() {
        AddressBook addressBook = new AddressBook();
        ContactInfo contacts = new ContactInfo("Devendra", "Kumar", "Garkha", "Saran", "Bihar", 841311, 8123273639l, "deva@gmail.com");
        boolean result = addressBook.addContacts(contacts);
        Assertions.assertTrue(result);
    }
    @Test
    public void givenEditNameInAddressBookWhenNameReturnTrue() {
        AddressBook addressBook = new AddressBook();
        ContactInfo contacts = new ContactInfo("Devendra", "Kumar", "Garkha", "Saran", "Bihar", 841311, 8123273639l, "deva@gmail.com");
        boolean result = addressBook.addContacts(contacts);
        ContactInfo editContact = addressBook.editContacts(addressBook.contactList, "Devendra", "address","editContacts");
        Assertions.assertEquals("Garkha", editContact.address);
    }

    @Test
    public void givenNameWhenDeleteShouldReturnTrue() {
        AddressBook addressBook = new AddressBook();
        ContactInfo contacts = new ContactInfo("Devendra", "Kumar", "Garkha", "Saran", "Bihar", 841311, 8123273639l, "deva@gmail.com");
        boolean contactsList = addressBook.addContacts(contacts);
        List<ContactInfo> deleteContactList = addressBook.deleteContacts(contactsList, "Devendra");
        Assertions.assertEquals(1, deleteContactList.size());
    }
    @Test
    public void givenListOfMultipleContactsWhenAddedShouldReturnTrue() {
        AddressBook addressBook = new AddressBook();
        List<ContactInfo> contactDataList = new ArrayList<>();
        contactDataList.add(new ContactInfo("Abhi", "Raj", "Btm", "Bangalore", "KA", 56007, 9739251118l, "abhi@gmail.com"));
        contactDataList.add(new ContactInfo("Devendra", "Kumar", "Garkha", "Saran", "Bihar", 841311, 812327363, "dev@gmail.com"));
        List<ContactInfo> contactList = addressBook.addMultipleContactsList(contactDataList);
        Assertions.assertEquals(2, contactList.size());
    }
    @Test
    public void givenContactInAddressBookReturnTrue() {
        AddressBook addressBook = new AddressBook();
        ContactInfo contacts = new ContactInfo("Devendra", "Kumar", "Garkha", "Saran", "Bihar", 841311, 8123273639L, "dev@gmail.com");
        HashMap<String, List<ContactInfo>> contactsList = addressBook.addContacts("Details", contacts);
        Assertions.assertEquals(1, contactsList.get("Details").size());
    }

}