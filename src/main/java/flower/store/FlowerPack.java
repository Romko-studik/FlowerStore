package flower.store;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class FlowerPack {
    @Getter
    private Flower flower;
    @Getter
    private int quantity;
    public double getPrice(){
        return flower.getPrice() * quantity;
    }
    void add(int a){
        quantity +=a;
    }
}
