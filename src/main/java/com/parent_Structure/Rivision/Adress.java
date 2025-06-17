package com.parent_Structure.Rivision;

public class Adress {

    private String Street;
    private String Landmark;
    private String City ;

    @Override
    public String toString() {
        return "Adress{" +
                "Street='" + Street + '\'' +
                ", Landmark='" + Landmark + '\'' +
                ", City='" + City + '\'' +
                '}';
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getLandmark() {
        return Landmark;
    }

    public void setLandmark(String landmark) {
        Landmark = landmark;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
