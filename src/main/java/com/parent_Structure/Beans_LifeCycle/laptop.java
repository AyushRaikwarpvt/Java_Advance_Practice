package com.parent_Structure.Beans_LifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class laptop {

    private  String CompanyName;

    public String getCompanyName() {
        return CompanyName;
    }

    @Override
    public String toString() {
        return "laptop{" +
                "CompanyName='" + CompanyName + '\'' +
                '}';
    }

    public laptop(String companyName) {
        CompanyName = companyName;
    }
    public  laptop (){
        super();
    }
    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    @PostConstruct
    public void Hey(){
        System.out.println("Those is Beinginer Method");
    }

    @PreDestroy
    public  void by(){
        System.out.println("Those is End");
    }
}
