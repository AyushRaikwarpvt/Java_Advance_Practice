package com.parent_Structure.AutoWiringByType;

public class Emp {
    private Post post ;
    private  String Emp_Name ;

    public Post getPost() {
        return post;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "post=" + post +
                ", Emp_Name='" + Emp_Name + '\'' +
                '}';
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String getEmp_Name() {
        return Emp_Name;
    }

    public void setEmp_Name(String emp_Name) {
        Emp_Name = emp_Name;
    }

    public Emp(Post post, String emp_Name) {
        this.post = post;
        Emp_Name = emp_Name;
    }
    public  Emp(){
        super();
    }

}
