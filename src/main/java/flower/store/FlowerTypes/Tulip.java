package flower.store.FlowerTypes;

import flower.store.Flower;
import flower.store.FlowerColor;
import flower.store.FlowerType;

public class Tulip extends Flower{
    Tulip(FlowerColor col){
        super(25,col,20,FlowerType.TULIP);
        setId(3);
    }
}
