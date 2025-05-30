package com.parent_Structure.AutoWiring;

public class Employe {
    private Address address;
    private String emp_Name;  // ✅ New variable (camelCase)

    // ✅ Constructor with both fields
    public Employe(Address address, String emp_Name) {
        this.address = address;
        this.emp_Name = emp_Name;
    }

    // ✅ Default constructor
    public Employe() {
        super();
    }

    // ✅ toString method updated
    @Override
    public String toString() {
        return "Employe{" +
                "address=" + address +
                ", emp_Name='" + emp_Name + '\'' +
                '}';
    }

    // ✅ Getters and setters
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmp_Name() {
        return emp_Name;
    }

    public void setEmp_Name(String emp_Name) {
        this.emp_Name = emp_Name;
    }
}
