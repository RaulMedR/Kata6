
package kata6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproduct.Toy;
import business.ToyBusiness;
import factories.regionalfactories.AmericanCarToyFactory;
import factories.regionalfactories.AsianHelicopterToyFactory;

public class Kata6 {
    
    
    public static void main(String[] args) {
        //ToyBusiness toyBusiness = new ToyBusiness(new AmericanToyFactory());
        ToyBusiness toyBusiness = new ToyBusiness();
        toyBusiness.add("car", new AmericanCarToyFactory());
        toyBusiness.add("helicopter", new AsianHelicopterToyFactory());
        ArrayList<Toy> toys = new ArrayList<>();
        
        Scanner in = new Scanner(System.in);
        String line = "";
        
        while(!line.equals("exit")){
            line = in.nextLine();
            switch (line){
                case "car":
                case "helicopter":
                    toys.add(toyBusiness.produceToy(line));
                    System.out.println("Built toys: " + toys.stream().map(c -> c.toString()).collect(Collectors.joining(", ")));
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Command unknown!");
                    
            }
            
        }
        
    }
    
    
    
    
    
}
