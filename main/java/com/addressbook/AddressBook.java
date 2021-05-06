package com.addressbook;

import java.util.ArrayList;
import java.util.List;

/*@Description-Creating a Address Book.
 * Contacts are created.
 * Add a new contacts into a address book.
 */
public class AddressBook {

    /* @Description - Create one addContacts() method. */
    public boolean addContacts(ContactInfo contacts) {
        System.out.println(contacts);
        List<ContactInfo> contactList = new ArrayList<>();
        try {
            contactList.add(contacts);
            System.out.println(contactList);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}