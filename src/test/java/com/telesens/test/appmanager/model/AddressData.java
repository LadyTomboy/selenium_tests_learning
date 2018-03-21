package com.telesens.test.appmanager.model;

public class AddressData {
    private final String firstName;
    private final String lastName;
    private final String address;
    private final String city;
    private final String stateValue;
    private final String postcode;
    private final String phone;
    private final String addressTitle;


    public AddressData(String firstName, String lastName, String address, String city, String stateValue, String postcode, String phone, String addressTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.stateValue = stateValue;
        this.postcode = postcode;
        this.phone = phone;
        this.addressTitle = addressTitle;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getStateValue() {
        return stateValue;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddressTitle() {
        return addressTitle;
    }
}
