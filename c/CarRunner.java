package c; // Copilot

public class CarRunner {
    public static void main(String[] args) {
        // Specific example: Electric-only calculation
        ElectricVehicle electricCar = new Hybrid(100, 0);
        electricCar.setCostPerKWh(0.24);
        double miles = 300;
        double kWhUsed = 70;
        double mpge = electricCar.calculateMPGe(miles, kWhUsed);
        System.out.printf("Electric Mode: %.1f miles, %.1f kWh, MPGe = %.2f, Cost per kWh = $%.2f%n",
                miles, kWhUsed, mpge, electricCar.getCostPerKWh());

        // Gas-only calculation
        GasVehicle gasCar = new Hybrid(0, 100);
        gasCar.setCostPerGallon(3.50);
        double gallonsUsed = 10;
        double mpg = gasCar.calculateMPG(miles, gallonsUsed);
        System.out.printf("Gas Mode: %.1f miles, %.1f gallons, MPG = %.2f, Cost per gallon = $%.2f%n",
                miles, gallonsUsed, mpg, gasCar.getCostPerGallon());

        // Hybrid average calculation
        Hybrid hybridCar = new Hybrid(80, 80);
        hybridCar.setCostPerGallon(3.50);
        hybridCar.setCostPerKWh(0.24);

        double hybridMPG = hybridCar.calculateMPG(miles, gallonsUsed);
        double hybridMPGe = hybridCar.calculateMPGe(miles, kWhUsed);
        double hybridAverage = (hybridMPG + hybridMPGe) / 2;

        System.out.printf("Hybrid Mode: %.1f miles, %.1f gallons, %.1f kWh, MPG = %.2f, MPGe = %.2f, Average = %.2f%n",
                miles, gallonsUsed, kWhUsed, hybridMPG, hybridMPGe, hybridAverage);

        // Cost comparison
        double gasCost = gallonsUsed * gasCar.getCostPerGallon();
        double electricCost = kWhUsed * electricCar.getCostPerKWh();
        System.out.printf("Cost Comparison: Gas = $%.2f, Electric = $%.2f%n", gasCost, electricCost);
    }
}