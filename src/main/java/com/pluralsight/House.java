package com.pluralsight;

public class House extends Asset {

    protected String address;
    protected int condition;
    protected int squareFoot;
    protected int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    //GETTERS

    public String getAddress() {
        return address;
    }

    public int getCondition() {
        return condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    @Override
    public double getValue() {

        double lotSizePerSquareFoot = lotSize * 0.25;

        double costPerSquareFoot = (originalCost / squareFoot) + lotSizePerSquareFoot;

        if (costPerSquareFoot >= 180) {
            condition = 1;
        } else if (costPerSquareFoot <= 130 && costPerSquareFoot > 90) {
            condition = 2;
        } else if (costPerSquareFoot <= 90 && costPerSquareFoot > 80) {
            condition = 3;
        } else if (costPerSquareFoot <= 80) {
            condition = 4;
        } else {
            condition = 4;
        }

        return super.getValue();
    }

    //SETTERS

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
}
