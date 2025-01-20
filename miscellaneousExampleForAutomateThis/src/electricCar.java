public class electricCar extends car{

    public int batteryCharging;
    private String batteryHealth;
    private int mileageInOneCharge;

    public electricCar(String brandName, String make, String model, int builtYear, int chassisNumber, int batteryCharging, String batteryHealth, int mileageInOneCharge) {
        super(brandName, make, model, builtYear, chassisNumber);
        this.batteryCharging=batteryCharging;
        this.batteryHealth=batteryHealth;
        this.mileageInOneCharge=mileageInOneCharge;
    }

    public String getBatteryCharging() {
        return batteryCharging + " %";
    }

    public String getMileageInOneCharge() {
        return mileageInOneCharge+" Kms";
    }

    public String getBatteryHealth() {
        return batteryHealth;
    }
}
