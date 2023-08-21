package DAO;

import DTO.Item;

import java.util.*;
import java.util.stream.Collectors;

public class ItemDAO {

    private List<Item> item;
    private Scanner sc;

    public ItemDAO(){
        item = new ArrayList<Item>();
        sc = new Scanner(System.in);
    }

    public void display(){
        item.stream().forEach(itemobj -> {
            System.out.println("Name " + itemobj.getName());
            System.out.println("Category " + itemobj.getCategory());
            System.out.println("Price " + itemobj.getBuyPrice());
        });
    }

    public void sort(List<Item> item){
        Collections.sort(item, new Comparator<Item>(){

            @Override
            public int compare(Item o1, Item o2){
                return o1.getCategory().compareTo(o2.getCategory());
            }
        });

        item.stream().forEach(itemobj -> {
            System.out.println("Name " + itemobj.getName());
            System.out.println("Category " + itemobj.getCategory());
            System.out.println("Price " + itemobj.getBuyPrice());
        });
    }

    public void sortByPrice(List<Item> item){
        Collections.sort(item, new Comparator<Item>(){

            @Override
            public int compare(Item o1, Item o2){
                return Double.compare(o1.getBuyPrice(),o2.getBuyPrice());
            }
        });

        item.stream().forEach(itemobj -> {
            System.out.println("Name " + itemobj.getName());
            System.out.println("Category " + itemobj.getCategory());
            System.out.println("Price " + itemobj.getBuyPrice());
        });
    }

    public void filterByCategory(List<Item> iten, String y){
        List<Item> al = iten.stream().filter(p -> p.getCategory().equals(y)).collect(Collectors.toList());
        al.stream().forEach(itemobj -> {
            System.out.println("Name " + itemobj.getName());
            System.out.println("Category " + itemobj.getCategory());
            System.out.println("Price " + itemobj.getBuyPrice());
        });
    }
}
