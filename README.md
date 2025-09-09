# Lab-1: Basic JUnit 4

## Overview
A Java application that calculates MPG (miles per gallon) for gas vehicles, MPGe (miles per gallon equivalent) for electric vehicles, and hybrid efficiency using JUnit 4 for testing.

## Prerequisites
- Java (JDK 8 or newer)
- Command line access

## Project Structure
```
Lab-1/
├── c/
│   ├── CarRunner.java          # Main class with examples
│   ├── ElectricVehicle.java    # Electric vehicle interface
│   ├── GasVehicle.java         # Gas vehicle interface
│   ├── Hybrid.java             # Hybrid implementation
│   └── HybridTest.java         # Unit tests
├── junit-4.13.2.jar           # JUnit framework
├── hamcrest-core-1.3.jar      # Hamcrest matchers
└── README.md                   # This file
```

## Download Dependencies
```bash
wget https://repo1.maven.org/maven2/junit/junit/4.13.2/junit-4.13.2.jar
wget https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar
```

## Build
```bash
javac -cp "junit-4.13.2.jar" ./c/*.java
```

## Run Main Program
```bash
java -cp "./" c.CarRunner
```

## Run Unit Tests
```bash
java -cp "junit-4.13.2.jar:hamcrest-core-1.3.jar:./" org.junit.runner.JUnitCore c.HybridTest
```

## Key Calculations
- **MPG**: miles ÷ gallons used
- **MPGe**: miles ÷ (kWh used ÷ 33.7) 
- **Hybrid Average**: (MPG + MPGe) ÷ 2

## Example Output
The program demonstrates:
1. Electric-only mode with 300 miles using 70 kWh
2. Gas-only mode with 300 miles using 10 gallons  
3. Hybrid mode combining both calculations
4. Cost comparison between gas and electric operation

## AI Usage
Code generation assisted by GitHub Copilot (marked with comments).