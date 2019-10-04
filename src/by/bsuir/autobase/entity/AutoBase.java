package by.bsuir.autobase.entity;

import java.util.List;

public class AutoBase implements java.io.Serializable{

    private double money;
    private List<Vehicle> carList;
    private List<Trade> tradeList;

    public List<Trade> getTradeList() {
        return tradeList;
    }

    public void setTradeList(List<Trade> tradeList) {
        this.tradeList = tradeList;
    }

    public int getCarCount() {
        return carList.size();
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public List<Vehicle> getCarList() {
        return carList;
    }

    public void setCarList(List<Vehicle> carList) {
        this.carList = carList;
    }

}
