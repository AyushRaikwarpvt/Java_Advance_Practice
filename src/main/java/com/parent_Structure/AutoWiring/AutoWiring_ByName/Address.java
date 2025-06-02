package com.parent_Structure.AutoWiring.AutoWiring_ByName;

public class Address {

    String city;
    String street;

    public Address(){
        super();
    }
    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
