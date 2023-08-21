package DTO;

public class Product extends Item{
    private int id;

    private String category;
    private String name;
    private double price;
    private int qun;


    public Product(String name, String category, int qun, double price){
        super.getCategory();
        this.category = category;
        this.name = name;
        this.price = price;
        this.qun = qun;
    }



    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public void setQun(int qun){
        this.qun = qun;
    }

    public int getQun(){
        return this.qun;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getCategory(){
        return category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", qun=" + qun +
                '}';
    }
}
