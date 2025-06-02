package com.parent_Structure.AutoWiringByAnotation;

public class FavFood {
    private String favfood ;

    public FavFood(String favfood) {
        this.favfood = favfood;
    }

    public String getFavfood() {
        return favfood;
    }

    public void setFavfood(String favfood) {
        this.favfood = favfood;
    }

    @Override
    public String toString() {
        return "FavFood{" +
                "favfood='" + favfood + '\'' +
                '}';
    }
    public  FavFood(){
        super();
    }
}
