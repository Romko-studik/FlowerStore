package flower.store;

import java.util.Arrays;
import java.util.Scanner;

public class Store {
     FlowerBucket[] inventory;
        Store(FlowerBucket[] inv){
            inventory = inv;
        }    
    void addBucket(FlowerBucket bck){
        inventory = Arrays.copyOf(inventory,inventory.length + 1);
        inventory[inventory.length] = bck;
    }
    void search(int num, Flower fl){
        for(int i = 0; i < inventory.length; i++){
            if(inventory[i].flowCount[fl.getId()] >= num){
                inventory[i].print();
                System.out.println("Price=" + inventory[i].price());
            }
        }
    };
}
