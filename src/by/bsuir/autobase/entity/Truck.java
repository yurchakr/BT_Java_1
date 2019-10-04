package by.bsuir.autobase.entity;

public class Truck extends Vehicle implements java.io.Serializable{

    public Truck(String make, String model, String colour, double price, double fuelConsumption, int power, int year, FuelType fuelType,int capacity, TruckCategory truckCategory) {
        super(make, model, colour, price, fuelConsumption, power, year, fuelType);
        this.capacity = capacity;
        this.truckCategory = truckCategory;
    }

    private int capacity;
    private TruckCategory truckCategory;

    public TruckCategory getTruckCategory() {
        return truckCategory;
    }

    public void setTruckCategory(TruckCategory truckCategory) {
        this.truckCategory = truckCategory;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
