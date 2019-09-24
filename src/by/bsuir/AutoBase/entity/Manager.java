package by.bsuir.AutoBase.entity;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Human implements java.io.Serializable{

    public Manager() {

    }
    private double Salary;

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public void AddForSale(List<Vehicle> vehicleList)
    {
        //Work with Console Input. Read data about adding vehicle
        Car car = new Car();
        
        vehicleList.add(car);
    }
    
    public void RemoveFromSale(List<Vehicle> vehicleList)
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
    
    public void EditVehicleInfo(List<Vehicle> vehicleList)
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
