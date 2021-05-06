package com.addressbook;
/*
 * contact information has first name, last name, number,address
 * state,city,zipcode, age and email
 */
public class ContactInfo {

    String First_Name;
    String Last_Name;
    String Address;
    String City;
    String State;
    String Postal_Code;
    String Country;
    String Contact_Number;
    String Email;
    ContactInfo(String firstname,String lastname,String address,String city,String state,String zipcode,String country,String mob,String mail)
    {
        this.First_Name=firstname;
        this.Last_Name=lastname;
        this.Address=address;
        this.City=city;
        this.State=state;
        this.Postal_Code=zipcode;
        this.Country=country;
        this.Contact_Number=mob;
        this.Email=mail;
    }

    public String toString() {
        return String.format(First_Name+ " "+Last_Name+ " " +Address+ " "+City+ " "+State+" "+Postal_Code+" "
                +Country+" "+Contact_Number+" "+Email);
    }

}