package com.parent_Structure.AutoWiringByAnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Anuj {


    private String NickName ;

    @Autowired
    @Qualifier("FavFood2")
    private FavFood FavFood;

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String nickName) {
        NickName = nickName;
    }

    public FavFood getFavFood() {
        return FavFood;
    }


    public void setFavFood(FavFood favFood) {
        FavFood = favFood;
    }

    @Override
    public String toString() {
        return "Anuj{" +
                "NickName='" + NickName + '\'' +
                ", FavFood=" + FavFood +
                '}';
    }


    public Anuj(String nickName) {
        NickName = nickName;

    }

    public Anuj(FavFood favFood){
        FavFood = favFood;
    }
    public Anuj(){
        super();
    }
}
