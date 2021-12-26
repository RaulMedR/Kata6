package factories;

public class SerialNumberGenerator {
    
    private Integer serialNumber = 0;
    static private SerialNumberGenerator instance = null;

    private SerialNumberGenerator() {
    }
    
    public static SerialNumberGenerator getInstance(){
        if (instance == null){
            instance = new SerialNumberGenerator();
        }
        return instance;
    }
    
    public Integer next(){
        return this.serialNumber++;
    }

}
