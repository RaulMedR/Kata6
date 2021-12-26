package factories;

import toyproduct.Toy;

public abstract class ToyFactory {
    
    public Toy produceToy(){
        Toy toy = this.createToy(SerialNumberGenerator.getInstance().next());
        toy.pack();
        toy.label();
        return toy;
    }
    
    protected abstract Toy createToy(Integer serialNumber);
}
