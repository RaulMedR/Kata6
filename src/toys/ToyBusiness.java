package toys;

import toyproduct.Toy;
import toyproduct.models.HelicopterToy;
import toyproduct.models.CarToy;

public class ToyBusiness {
    final private SerialNumberGenerator generator = new SerialNumberGenerator();
    
    public Toy createToy(String type){
        switch(type){
            case "car":
                Toy car = new CarToy(generator.next());
                car.pack();
                car.label();
                return car;
            case "helicopter":
                Toy helicopter = new HelicopterToy(generator.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;
            default:
                return null;
        }
    }
    
    

}
