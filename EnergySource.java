
abstract class EnergySource {
    int sourceID;
    String sourceName;
    double energyGenerated;

    // Constructor
    EnergySource(int sourceID, String sourceName, double energyGenerated) {
        this.sourceID = sourceID;
        this.sourceName = sourceName;
        this.energyGenerated = energyGenerated;
    }

    // Abstract method
    abstract double calculateEfficiency();

    // Display source details
    void displayDetails() {
        System.out.println("Source ID: " + sourceID);
        System.out.println("Source Name: " + sourceName);
        System.out.println("Energy Generated: " + energyGenerated + " kWh");
        System.out.println("Efficiency: " + calculateEfficiency() + "%");
        System.out.println("--------------------------------");
    }
}

// Derived class: Solar Energy
class SolarEnergy extends EnergySource {

    SolarEnergy(int id, String name, double energy) {
        super(id, name, energy);
    }

    @Override
    double calculateEfficiency() {
        return (energyGenerated / 5000) * 100;
    }
}

// Derived class: Wind Energy
class WindEnergy extends EnergySource {

    WindEnergy(int id, String name, double energy) {
        super(id, name, energy);
    }

    @Override
    double calculateEfficiency() {
        return (energyGenerated / 8000) * 100;
    }
}

// Main class
class Main {
    public static void main(String[] args) {

        // Dynamic method dispatch
        EnergySource source;

        source = new SolarEnergy(101, "Solar Panel", 4000);
        System.out.println("Solar Energy Details:");
        source.displayDetails();

        source = new WindEnergy(102, "Wind Turbine", 6000);
        System.out.println("Wind Energy Details:");
        source.displayDetails();
    }
}
