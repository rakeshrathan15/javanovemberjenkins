package com.neoteric.javademojenkins;

public class Address {

    private String street;
    private  String city;
    private   String pincode;

    public Address(){

    }

    private Address(String street, String city, String pincode) {
        this.street = street;
        this.city = city;
        this.pincode = pincode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public static Address getInstance(){
        Address address= new Address("Balaji nagar","hyd","508213");
        return address;

    }
}
