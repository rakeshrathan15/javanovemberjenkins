package com.neoteric.javademojenkins;

public class AddressStaticVariables {

    private   String street;

    private  String city;

    private  String pincode;

    private AddressStaticVariables() {


    }

    private AddressStaticVariables(String street, String city, String pincode) {
        this.street = street;
        this.city = city;
        this.pincode = pincode;
    }

    public AddressStaticVariables(String street) {
        this.street = street;
    }

    public static AddressStaticVariables getInstance(){
        AddressStaticVariables addressStaticVariables= new AddressStaticVariables("balaji nagar");
        return addressStaticVariables;

    }
}
