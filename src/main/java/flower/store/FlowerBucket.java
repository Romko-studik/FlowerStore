package flower.store;

import java.util.Arrays;

import lombok.Getter;
import lombok.Setter;

public class FlowerBucket {

    private int size;
    @Getter
    FlowerPack[] packs;
    @Getter
    @Setter
    int[] flowCount;
    double price(){
        double sum = 0;
        for(int i =0;i < packs.length;i ++){
            sum += packs[i].getPrice();
        }
        return sum;
    }
    FlowerBucket(){
        packs = new FlowerPack[5];
        flowCount = new int[10];
        for(int i = 0; i < packs.length;i++){
            flowCount[packs[i].getFlower().getId()] += packs[i].getQuantity();
        }
        size = 0;
    }
    void add(FlowerPack pack){
        if(size > packs.length){
            packs = Arrays.copyOf(packs,size*2);
        }
        packs[size] = pack;
        size++;
    }
    void print(){
        for(int i = 0;i < flowCount.length;i++){
            System.out.println(i + "  " + flowCount[i]);
        }
    }
    
}
