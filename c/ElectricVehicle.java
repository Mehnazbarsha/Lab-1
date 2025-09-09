package c;

public interface ElectricVehicle {
    void chargeBattery();
    int getBatteryLevel();

    void setCostPerKWh(double cost); // Copilot
    double getCostPerKWh(); // Copilot

    double calculateMPGe(double miles, double kWh); // Copilot
}