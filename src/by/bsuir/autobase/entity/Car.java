package by.bsuir.autobase.entity;

public class Car extends  Vehicle implements java.io.Serializable{

    public Car(String make, String model, String colour, double price, double fuelConsumption, int power, int year, FuelType fuelType,int seatCount, BodyType bodyType, int doorCount) {
        super(make, model, colour, price, fuelConsumption, power, year, fuelType);
        this.seatCount = seatCount;
        this.bodyType = bodyType;
        this.doorCount = doorCount;
    }

    private int seatCount;
    private BodyType bodyType;
    private int doorCount;

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }
}
