package flower.store.FlowerTypes;
import flower.store.Flower;
import flower.store.FlowerColor;
import flower.store.FlowerType;

public class Rose extends Flower{
    Rose(FlowerColor col){
super(20.0,col,30,FlowerType.ROSE);
setId(2);   
}
}
