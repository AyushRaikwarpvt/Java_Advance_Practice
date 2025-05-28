package com.parent_Structure.Beans_LifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class KeyBoard implements InitializingBean , DisposableBean {
    private  String CompanyName;

    public KeyBoard(String companyName) {
        CompanyName = companyName;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    @Override
    public String toString() {
        return "KeyBoard{" +
                "CompanyName='" + CompanyName + '\'' +
                '}';
    }

    public  KeyBoard(){
        super();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("this Entry Function Is  also Called Being");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("This is Ending Function Calling");
    }
}
