package com.example;

import java.util.List;

public class Alex extends Lion{

    public Alex(Feline feline) throws Exception{
        super(feline,"Самец");
    }

    public List<String> getFriends(){
        List<String> alexFriends = List.of("Марти","Глория","Мелман");
        return alexFriends;
    }

    public String getPlaceOfLiving(){
        return "Нью-Йоркский зоопарк";
    }

    public int getKittens() {
        return 0;
    }
}
