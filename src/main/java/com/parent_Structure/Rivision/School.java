package com.parent_Structure.Rivision;

public class School {
    private String Sch_Name;

    @Override
    public String toString() {
        return "School{" +
                "Sch_Name='" + Sch_Name + '\'' +
                ", Sch_Adress='" + Sch_Adress + '\'' +
                '}';
    }

    public String getSch_Name() {
        return Sch_Name;
    }

    public School(String sch_Name, String sch_Adress) {
        Sch_Name = sch_Name;
        Sch_Adress = sch_Adress;
    }

    public void setSch_Name(String sch_Name) {
        Sch_Name = sch_Name;
    }

    public String getSch_Adress() {
        return Sch_Adress;
    }

    public void setSch_Adress(String sch_Adress) {
        Sch_Adress = sch_Adress;
    }

    private String Sch_Adress;
}
