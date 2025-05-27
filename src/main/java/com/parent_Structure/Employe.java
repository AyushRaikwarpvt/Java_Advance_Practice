package com.parent_Structure;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employe {
    private String Name ;
    private List<String> Phone;
    private Set<String> Adress;
    private Map<String,String> Course;


    @Override
    public String toString() {
        return "Employe{" +
                "Name='" + Name + '\'' +
                ", Phone=" + Phone +
                ", Adress=" + Adress +
                ", Course=" + Course +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<String> getPhone() {
        return Phone;
    }

    public void setPhone(List<String> phone) {
        Phone = phone;
    }

    public Set<String> getAdress() {
        return Adress;
    }

    public void setAdress(Set<String> adress) {
        Adress = adress;
    }

    public Map<String, String> getCourse() {
        return Course;
    }

    public void setCourse(Map<String, String> course) {
        Course = course;
    }



    public Employe(String name, List<String> phone, Set<String> adress, Map<String, String> course) {
        Name = name;
        Phone = phone;
        Adress = adress;
        Course = course;
    }
public Employe(){
        super();
}


}
