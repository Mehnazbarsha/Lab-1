package c;

public interface GasVehicle {
    void refuel();
    int getFuelLevel();

    void setCostPerGallon(double cost); // Copilot
    double getCostPerGallon(); // Copilot

    double calculateMPG(double miles, double gallonsUsed); // Copilot
}