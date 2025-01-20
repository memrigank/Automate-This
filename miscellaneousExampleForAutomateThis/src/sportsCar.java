public class sportsCar extends car{

    private int horsePower;
    public int topSpeed;
    private int zeroToHundred;

    public sportsCar(String brandName, String make, String model, int builtYear, int chassisNumber, int horsePower, int topSpeed, int zeroToHundred){
       super(brandName, make, model, builtYear, chassisNumber);
       this.horsePower=horsePower;
       this.topSpeed=topSpeed;
       this.zeroToHundred=zeroToHundred;
    }

    public String  getTopSpeed(){
        return topSpeed + "KM/h";
    }

    public String getHorsePower() {
        return horsePower + " hp";
    }

    public String getZeroToHundred() {
        return zeroToHundred + " Secs";
    }
}
