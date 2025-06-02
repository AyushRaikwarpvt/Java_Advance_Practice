package com.parent_Structure.AutoWiringByType;

public class Post {

    String postName ;

    @Override
    public String toString() {
        return "Post{" +
                "postName='" + postName + '\'' +
                '}';
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public Post(String postName) {
        this.postName = postName;
    }

    public Post(){
        super();
    }



}
