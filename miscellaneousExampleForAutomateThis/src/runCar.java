public class runCar {

    public static void main(String[] args){
        electricCar EC = new electricCar("Maruti", "India", "Gen EC",
                2021, 32463, 80, "Good", 300);
        System.out.println("The Car is from Brand "+ EC.brandName+ " and the model is "+ EC.model);
        System.out.println("The Car was manufactured in "+ EC.make + " in Year "+ EC.builtYear);
        System.out.println("The battery is charged at "+EC.batteryCharging+ " %");
        System.out.println("The car can go upto "+EC.getMileageInOneCharge()+ " in one charge");
        System.out.println("The Battery currently is in "+ EC.getBatteryHealth()+ " Health");
        sportsCar sC = new sportsCar("Lamburgani","USA", "GTX1000", 2020,
                36388,100, 300, 10);
        System.out.println("This Car is from Brand "+        sC.brandName);
        System.out.println("The Car has "+       sC.getHorsePower());
        System.out.println("The car is built in "+        sC.builtYear);
        System.out.println("Top Speed of the car is "+ sC.topSpeed); // called directly using an object as it public variable
        System.out.println("The car can get from 0 to 100 in " +sC.getZeroToHundred()); //called via method as it is a private variable
        System.out.println("Total number of car sold are "+ car.carCount); //called directly as the variable is static
    }
}
