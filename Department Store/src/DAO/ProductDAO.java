package DAO;

import DTO.Item;
import DTO.Product;

import java.util.*;
import java.util.stream.Collectors;

public class ProductDAO {

    private Map<Integer, Product> prod;
    private Scanner sc;

    private List<Product> pr;

    public ProductDAO(){
        pr = new ArrayList<Product>();
        prod = new HashMap<Integer,Product>();
        sc = new Scanner(System.in);
    }

    public void display(){
        for(Integer i : prod.keySet()){
            System.out.println("ID: " + i + "PRODUCT DETAILS: " + prod.get(i).toString());
        }
    }

    public void searchById(int n, Map<Integer, Product> prod){
        System.out.println("ID: " + n + prod.get(n));
    }

    public void searchByName(String nam, Map<Integer, Product> prod){
        int c = 0;
        for (Map.Entry<Integer, Product> entry : prod.entrySet()) {
            if (entry.getValue().getName().equals(nam)) {
                System.out.println(entry.getKey());
                c = entry.getKey();
            }
            System.out.println("ID: " + c + prod.get(c));
        }
    }

    public void sort(List<Product> pr){
        Collections.sort(pr, new Comparator<Product>(){

            @Override
            public int compare(Product o1, Product o2){
                return o1.getCategory().compareTo(o2.getCategory());
            }
        });

        pr.stream().forEach(itemobj -> {
            System.out.println("Name " + itemobj.getName());
            System.out.println("Category " + itemobj.getCategory());
            System.out.println("Price " + itemobj.getBuyPrice());
            System.out.println("Quantity " + itemobj.getQun());
        });
    }
}
