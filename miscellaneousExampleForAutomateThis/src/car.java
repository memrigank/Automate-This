public class car {

    public String brandName;
    public String make;
    public String model;
    public int builtYear;
    final private int chassisNumber;
    static int carCount;

//Constructor with chassis number as final as it should be not be updated
    public car(String brandName, String make, String model, int builtYear, int chassisNumber){
        this.brandName=brandName;
        this.make=make;
        this.model=model;
        this.builtYear=builtYear;
        this.chassisNumber = chassisNumber;
        carCount++;
    }
}
