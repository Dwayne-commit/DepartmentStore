package DTO;

public class Item {
    String name;
    String category;
    double buyPrice;

    public Item(){}

    public Item(String name, String category, double buyPrice){
        this.name = name;
        this.category = category;
        this.buyPrice = buyPrice;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getCategory(){
        return this.category;
    }

    public void setBuyPrice(double buyPrice){
        this.buyPrice = buyPrice;
    }

    public double getBuyPrice(){
        return this.buyPrice;
    }
}
