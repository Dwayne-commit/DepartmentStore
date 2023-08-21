package Service;

import DAO.ItemDAO;
import DAO.ProductDAO;
import DTO.Item;
import DTO.Product;

import java.util.*;

public class StoreInformation {

    private Scanner sc;

    ItemDAO itemdao;

    List<Item> item;

    List<Product> pr;

    ProductDAO productDAO;

    Map<Integer, Product> prod;

    public StoreInformation(){
        itemdao = new ItemDAO();
        productDAO = new ProductDAO();
        sc = new Scanner(System.in);
        item = new ArrayList<Item>();
        prod = new HashMap<Integer, Product>();
        pr = new ArrayList<Product>();
    }


    public List<Item> insertItems(){
        item.add(new Item("Juice","Grocery",2.99));
        item.add(new Item("Celery","Vegetables",1.99));
        item.add(new Item("Gummy Worms","Grocery",1.99));
        item.add(new Item("Soap","Toiletry",3.14));
        item.add(new Item("Tissue","Toiletry",4.60));
        item.add(new Item("Pencils","Stationary",5.99));
        item.add(new Item("Bags","Stationary",9.99));
        item.add(new Item("Greeting Card","Stationary",4.15));
        item.add(new Item("Carrot","Vegetable",2.10));
        item.add(new Item("Milk","Grocery",2.00));
        return item;
    }

    public Map<Integer, Product> insertProducts(){
        prod.put(1,new Product("Juice","Grocery",50,4.48));
        prod.put(2,new Product("Celery","Vegetable",100,2.99));
        prod.put(3,new Product("Gummy Worms","Grocery",40,2.99));
        prod.put(4,new Product("Soap","Toiletry",60,4.71));
        prod.put(5,new Product("Tissue","Toiletry",200,6.90));
        prod.put(6,new Product("Pencils","Stationary",300,8.99));
        prod.put(7,new Product("Bags","Stationary",40,14.99));
        prod.put(8,new Product("Greeting Card","Stationary",700,6.22));
        prod.put(9,new Product("Carrot","Vegetable",44,3.15));
        prod.put(10,new Product("Milk","Grocery",23,3.00));
        return prod;
    }

    public List<Product> insertProd(){
        pr.add(new Product("Juice","Grocery",50,4.48));
        pr.add(new Product("Celery","Vegetable",100,2.99));
        pr.add(new Product("Gummy Worms","Grocery",40,2.99));
        pr.add(new Product("Soap","Toiletry",60,4.71));
        pr.add(new Product("Tissue","Toiletry",200,6.90));
        pr.add(new Product("Pencils","Stationary",300,8.99));
        pr.add(new Product("Bags","Stationary",40,14.99));
        pr.add(new Product("Greeting Card","Stationary",700,6.22));
        pr.add(new Product("Carrot","Vegetable",44,3.15));
        pr.add(new Product("Milk","Grocery",23,3.00));
        return pr;
    }

    public void printItem(){
        itemdao.display();
        item.stream().forEach(itemobj -> {
            System.out.println("Name " + itemobj.getName());
            System.out.println("Category " + itemobj.getCategory());
            System.out.println("Price " + itemobj.getBuyPrice());
        });
    }

    public void printProduct(){
        for(Integer i : prod.keySet()){
            System.out.println("ID: " + i + " PRODUCT DETAILS: " + prod.get(i).toString());
        }
    }

    public void filterByCategory(){
        itemdao.sort(item);
        System.out.println("ENTER THE NAME OF THE CATEGORY");
        String bnam = sc.nextLine();
        itemdao.filterByCategory(item,bnam);
    }

    public void filterByPrice(){
        itemdao.sortByPrice(item);
    }

    public void sortByCategory(){
        productDAO.sort(pr);
    }

    public void searchById(){
        System.out.println("ENTER ID NUMBER: ");
        int n = sc.nextInt();
        productDAO.searchById(n,prod);
    }

    public void searchByName(){
        System.out.println("ENTER THE NAME OF THE PRODUCT");
        String ni = sc.nextLine();
        productDAO.searchByName(ni,prod);
    }
}
