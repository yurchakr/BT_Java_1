package by.bsuir.AutoBase.entity;

import java.util.List;

public class Customer extends Human implements java.io.Serializable{

    private FuelType preferredFuelType;
    private String preferredMake;
    private double preferredFuelConsumption;

    public Customer() {

    }

    public FuelType getPreferredFuelType() {
        return preferredFuelType;
    }

    public void setPreferredFuelType(FuelType preferredFuelType) {
        this.preferredFuelType = preferredFuelType;
    }

    public String getPreferredMake() {
        return preferredMake;
    }

    public void setPreferredMake(String preferredMake) {
        this.preferredMake = preferredMake;
    }

    public double getPreferredFuelConsumption() {
        return preferredFuelConsumption;
    }

    public void setPreferredFuelConsumption(double preferredFuelConsumption) {
        this.preferredFuelConsumption = preferredFuelConsumption;
    }

    public void buyVehicle(List<Vehicle> vehicleList)
    {
        //Work with Console Input. Read data about buying vehicle
        Car car = new Car();
        car.setMake("Ford");
        for (Vehicle vehicle: vehicleList) {
            if (car.getMake().equals(vehicle.getMake()))
            {
                vehicleList.remove(car);
            }
        }
    }

}
