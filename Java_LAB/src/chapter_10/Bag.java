package chapter_10;

import java.util.ArrayList;
import java.util.List;

public class Bag {

    private List<Item> items;
    public Bag(){
        items = new ArrayList<>();
    }
    public void add(String itemName){
        for (Item item : items){
            if (item.getName().equals(itemName)){
                item.incrementQuantity();
                return;
            }
        }
        items.add(new Item(itemName,1));
    }
    public int count(String itemName){
        for ( Item item : items) {
            if (item.getName().equals(itemName)){
                return item.getQuantity();
            }
        }
        return 0;
    }
    private static class Item{
        private String name;
        private int quantity;
        public Item(String name,int quantity){
            this.name=name;
            this.quantity=quantity;
        }

        public String getName() {
            return name;
        }

        public int getQuantity() {
            return quantity;
        }

        public void incrementQuantity() {
            quantity++;
        }
    }
}

