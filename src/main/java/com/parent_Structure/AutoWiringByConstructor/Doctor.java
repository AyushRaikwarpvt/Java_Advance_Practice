package com.parent_Structure.AutoWiringByConstructor;

public class Doctor {

  private String Doc_Name ;
  private Marij marij;

    public Doctor(String doc_Name, Marij marij) {
        Doc_Name = doc_Name;
        this.marij = marij;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "Doc_Name='" + Doc_Name + '\'' +
                ", marij=" + marij +
                '}';
    }

    public String getDoc_Name() {
        return Doc_Name;
    }

    public void setDoc_Name(String doc_Name) {
        Doc_Name = doc_Name;
    }

    public Marij getMarij() {
        return marij;
    }

    public void setMarij(Marij marij) {
        this.marij = marij;
    }

    public Doctor(){
        super();
    }
}
