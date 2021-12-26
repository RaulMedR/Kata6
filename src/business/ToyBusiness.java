package business;

import toyproduct.Toy;
import toyproduct.models.AmericanHelicopterToy;
import toyproduct.models.AsianCarToy;

public  abstract class ToyBusiness {
    public final SerialNumberGenerator generator = new SerialNumberGenerator();
    public abstract Toy createToy(String type);
    /*
    public Toy createToy(String type){
        switch(type){
            case "car":
                Toy car = new AsianCarToy(generator.next());
                car.pack();
                car.label();
                return car;
            case "helicopter":
                Toy helicopter = new AmericanHelicopterToy(generator.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;
            default:
                return null;
        }
    }
*/
    
    

}
