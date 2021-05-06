package com.addressbook;

import java.util.ArrayList;
import java.util.List;

/*@Description-Creating a Address Book.
 * Contacts are created.
 * Add a new contacts into a address book.
 */
public class AddressBook {

    public List<ContactInfo> contactList;

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
    /*create one editContacts() method
     * Check a first name is match in address book then change details.
     */
    public ContactInfo editContacts(List<ContactInfo> contactList, String firstName, String name, String editDetails) {
        try {
            for(ContactInfo contact : contactList){
                if(contact.firstName.equals(name)) {
                    switch (name) {
                        case "firstName":
                            contact.firstName = editDetails;
                            break;
                        case "lastName":
                            contact.lastName = editDetails;
                            break;
                        case "address":
                            contact.address = editDetails;
                            break;
                        case "city":
                            contact.city = editDetails;
                            break;
                        case "state":
                            contact.state = editDetails;
                            break;
                        case "zip":
                            contact.zip = Integer.parseInt(editDetails);
                            break;
                        case "phoneNumber":
                            contact.number = Long.parseLong(editDetails);
                            break;
                        case "email":
                            contact.email = editDetails;
                            break;
                    }
                }
                return contact;
            }
        } catch (Exception e) {
            System.out.println("Detail not found " + e);
            e.printStackTrace();
        }
        return null;
    }
}
