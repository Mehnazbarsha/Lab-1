package c; // Copilot for some code in this package

public class Hybrid implements ElectricVehicle, GasVehicle {
    private int batteryLevel;
    private int fuelLevel;
    private int milesTraveled;
    private double costPerGallon; 
    private double costPerKWh; 

    public Hybrid(int batteryLevel, int fuelLevel) {
        this.batteryLevel = batteryLevel;
        this.fuelLevel = fuelLevel;
    }

    public void setMilesTraveled(int miles) {
        this.milesTraveled = miles;
    }

    public int getMilesTraveled() {
        return milesTraveled;
    }

    @Override
    public void setCostPerGallon(double cost) {
        this.costPerGallon = cost;
    }

    @Override
    public double getCostPerGallon() {
        return costPerGallon;
    }

    @Override
    public void setCostPerKWh(double cost) {
        this.costPerKWh = cost;
    }

    @Override
    public double getCostPerKWh() {
        return costPerKWh;
    }

    @Override
    public double calculateMPG(double miles, double gallonsUsed) {
        if (gallonsUsed == 0) return 0;
        return miles / gallonsUsed;
    }

    @Override
    public double calculateMPGe(double miles, double kWh) {
        if (kWh == 0) return 0;
        // 33.7 kWh = 1 gallon equivalent
        return miles / (kWh / 33.7);
    }

    @Override
    public void chargeBattery() {
        batteryLevel = 100;
        System.out.println("Battery fully charged.");
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public void refuel() {
        fuelLevel = 100;
        System.out.println("Fuel tank full.");
    }

    @Override
    public int getFuelLevel() {
        return fuelLevel;
    }
}