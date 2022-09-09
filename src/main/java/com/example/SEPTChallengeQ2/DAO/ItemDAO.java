package com.example.SEPTChallengeQ2.DAO;

import com.example.SEPTChallengeQ2.Model.Item;
import com.example.SEPTChallengeQ2.Model.Items;
import org.springframework.stereotype.Repository;


public class ItemDAO {
    private static Items list = new Items();

    static {
        list.getitemList().add(new Item("1","Bread", "White", "4.50"));
        list.getitemList().add(new Item("2","Butter", "Yellow", "3.50"));
        list.getitemList().add(new Item("3","Bread", "Wholemeal", "6.00"));
        list.getitemList().add(new Item("4","Milk", "Choclate, "2.00"));
    }

    public Items getAllItems(){
        return list
    }



}
