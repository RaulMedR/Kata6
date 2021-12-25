
package kata6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toys.Car;
import toys.Helicopter;
import toys.SerialNumberGenerator;
import toys.ToyBusiness;

public class Kata6 {
    
    
    public static void main(String[] args) {
        ToyBusiness toyBusiness = new ToyBusiness();
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Helicopter> helicopters = new ArrayList<>();
        
        Scanner in = new Scanner(System.in);
        String line = "";
        
        while(!line.equals("exit")){
            line = in.nextLine();
            switch (line){
                case "car":
                    cars.add(toyBusiness.createCar());
                    System.out.println("Built cars: " + cars.stream().map(c -> c.getSerialNumber().toString()).collect(Collectors.joining(", ")));
                    break;
                case "helicopter":
                    
                    helicopters.add(toyBusiness.createHelicopter());
                    System.out.println("Built helicopters: " + helicopters.stream().map(c -> c.getSerialNumber().toString()).collect(Collectors.joining(", ")));
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
