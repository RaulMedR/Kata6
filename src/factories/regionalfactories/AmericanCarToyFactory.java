package factories.regionalfactories;

import factories.ToyFactory;
import toyproduct.Toy;
import toyproduct.models.AmericanCarToy;

public class AmericanCarToyFactory extends ToyFactory{

    @Override
    public Toy createToy(Integer serialNumber) {
        AmericanCarToy car = new AmericanCarToy(serialNumber);
        return car;
    }

}
