import java.util.ArrayList;
import java.util.List;

// Interface CarbonFootprint
interface CarbonFootprint {
    double getCarbonFootprint();
}

// Class Building
class Building implements CarbonFootprint {
    private double squareFootage;
    private double energyConsumption; // in kWh

    public Building(double squareFootage, double energyConsumption) {
        this.squareFootage = squareFootage;
        this.energyConsumption = energyConsumption;
    }

    @Override
    public double getCarbonFootprint() {
        // Assuming 0.233 kg CO2 per kWh (average value)
        return energyConsumption * 0.233;
    }

    @Override
    public String toString() {
        return "Building with " + squareFootage + " square feet and " + energyConsumption + " kWh energy consumption";
    }
}

// Class Car
class Car implements CarbonFootprint {
    private double fuelConsumption; // in liters per 100 km
    private double distanceDriven; // in km

    public Car(double fuelConsumption, double distanceDriven) {
        this.fuelConsumption = fuelConsumption;
        this.distanceDriven = distanceDriven;
    }

    @Override
    public double getCarbonFootprint() {
        // Assuming 2.31 kg CO2 per liter of gasoline (average value)
        return (fuelConsumption / 100) * distanceDriven * 2.31;
    }

    @Override
    public String toString() {
        return "Car with " + fuelConsumption + " L/100km fuel consumption and " + distanceDriven + " km distance driven";
    }
}

// Class Bicycle
class Bicycle implements CarbonFootprint {
    private double distanceRidden; // in km

    public Bicycle(double distanceRidden) {
        this.distanceRidden = distanceRidden;
    }

    @Override
    public double getCarbonFootprint() {
        // Assuming 0 kg CO2 for riding a bicycle
        return 0;
    }

    @Override
    public String toString() {
        return "Bicycle with " + distanceRidden + " km distance ridden";
    }
}

// Main class to test the system
public class CarbonFootprintTest {
    public static void main(String[] args) {
        List<CarbonFootprint> carbonFootprints = new ArrayList<>();
        carbonFootprints.add(new Building(2500, 12000));
        carbonFootprints.add(new Car(8.5, 15000));
        carbonFootprints.add(new Bicycle(500));

        for (CarbonFootprint cf : carbonFootprints) {
            System.out.println(cf.toString());
            System.out.println("Carbon Footprint: " + cf.getCarbonFootprint() + " kg CO2");
            System.out.println();
        }
    }
}