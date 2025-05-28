package com.parent_Structure.Beans_LifeCycle;

public class Mouse {
    private  String CompanyName;

    public Mouse(String companyName) {
        CompanyName = companyName;
    }
public  Mouse(){
        super();
}
    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "CompanyName='" + CompanyName + '\'' +
                '}';
    }
    public void Shuru(){
        System.out.println("Yeh Start wali Method h ");
    }
    public  void End(){
        System.out.println("This Is End Methos");
    }
}
