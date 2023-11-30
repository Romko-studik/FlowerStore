package flower.store;

import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower {
    @Getter
    private double sepalLength = 0;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;
    @Setter
    @Getter
    int id;
    public Flower(double len, FlowerColor col, double pr, FlowerType type){
        sepalLength = len;
        color = col;
        price = pr;
        flowerType = type;
    }
    public Flower(){}
    public String getColor() {
        return color.toString();
    }
}
