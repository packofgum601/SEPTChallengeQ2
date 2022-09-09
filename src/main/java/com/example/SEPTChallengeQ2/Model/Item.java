package com.example.SEPTChallengeQ2.Model;

public class Item {
    public Item(){

    }
    private String id;
    private String name;
    private String desc;
    private double price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "item {" +
                "id="+id+ "\n"+
                ",name="+name+"\n"+
                ",desc="+desc+"\n"+
                ",price="+price+"\n"+
                '}';
    }


}
