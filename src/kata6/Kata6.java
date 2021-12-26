
package kata6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproduct.Toy;
import toyproduct.models.CarToy;
import toyproduct.models.HelicopterToy;
import toys.SerialNumberGenerator;
import toys.ToyBusiness;

public class Kata6 {
    
    
    public static void main(String[] args) {
        ToyBusiness toyBusiness = new ToyBusiness();
        ArrayList<Toy> toys = new ArrayList<>();
        
        Scanner in = new Scanner(System.in);
        String line = "";
        
        while(!line.equals("exit")){
            line = in.nextLine();
            switch (line){
                case "car":
                case "helicopter":
                    toys.add(toyBusiness.createToy(line));
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
