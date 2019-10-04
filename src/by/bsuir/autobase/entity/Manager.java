package by.bsuir.autobase.entity;

import java.util.List;

public class Manager extends Human implements java.io.Serializable{

    public Manager() {

    }
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void addForSale(List<Vehicle> vehicleList)
    {
        //Work with Console Input. Read data about adding vehicle
        Car car = new Car();
        
        vehicleList.add(car);
    }
    
    public void removeFromSale(List<Vehicle> vehicleList)
    {
        //Work with Console Input. Read data about deleting vehicle
        Car car = new Car();
        car.setMake("Ford");
        for (Vehicle vehicle: vehicleList) {
            if (car.getMake().equals(vehicle.getMake()))
            {
                vehicleList.remove(car);
            }
        }
    }
    
    public void editVehicleInfo(List<Vehicle> vehicleList)
    {
        //Work with Console Input. Read data about editing vehicle
        Car car = new Car();
        car.setMake("Ford");
        for (Vehicle vehicle: vehicleList) {
            if (car.getMake().equals(vehicle.getMake()))
            {
                vehicle.setColour("green");
            }
        }
    }
}
