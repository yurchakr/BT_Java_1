package by.bsuir;

import by.bsuir.autobase.entity.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
	AutoBase autobase = new AutoBase();

	/*
	 * Work with user console input
	 * Call necessary methods for objects
	 */


	Car car1 = new Car();
	car1.setSeatCount(7);
	car1.setBodyType(BodyType.SALOON);
	car1.setDoorCount(5);
	car1.setColour("blue");
	car1.setFuelConsumption(7.8);
	car1.setFuelType(FuelType.DIESEL);
    car1.setModel("Pajero");
    car1.setMake("Mitsubishi");
    car1.setYear(2007);
    car1.setPower(304);
    car1.setPrice(7800);
    List<Vehicle> vehList = new ArrayList<>();
    vehList.add(car1);
    autobase.setCarList(vehList);
    autobase.setMoney(1000);
    Car car2 = (Car)vehList.get(0);
    int doors = car2.getDoorCount();
    System.out.println(doors);

    saveAutoBase(autobase);
    AutoBase autoBase2 = loadAutoBase();

    }

    private static AutoBase loadAutoBase()
    {
        try(
                // Reading the object from a file
                FileInputStream file = new FileInputStream("AutoBase.ser");
                ObjectInputStream in = new ObjectInputStream(file);
                )
        {
            // Method for deserialization of object
            return (AutoBase)in.readObject();
        }

        catch(IOException | ClassNotFoundException ex)
        {
            System.out.println("IOException is caught");
            return null;
        }

    }

    // Method for serialization of object
    private static void saveAutoBase(AutoBase autoBase)
    {
        try(
                //Saving the object in a file
                FileOutputStream file = new FileOutputStream("AutoBase.ser");
                ObjectOutputStream out = new ObjectOutputStream(file);
                )
        {
            out.writeObject(autoBase);

        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }


    }
}
