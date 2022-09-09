package com.example.SEPTChallengeQ2.Model;
import java.util.ArrayList;
import java.util.List;

public class Items {
    private List<Item> itemList;

    public List<Item> getitemList() {
        if(itemList == null) {
            itemList = new ArrayList<>();
        }
        return itemList;

    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}








