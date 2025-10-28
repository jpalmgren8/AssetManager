package com.pluralsight;

public class Vehicle extends Asset{

    protected String makeModel;
    protected int year;
    protected int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    //GETTERS

    public String getMakeModel() {
        return makeModel;
    }

    public int getYear() {
        return year;
    }

    public int getOdometer() {
        return odometer;
    }

    @Override
    public double getValue() {

        int currentYear = 2025;

        int carAge = currentYear - year;

        if (carAge <= 3) {
            originalCost = originalCost - (originalCost * 0.03);
        } else if (carAge <= 6) {
            originalCost = originalCost - (originalCost * 0.06);
        } else if (carAge <= 10) {
            originalCost = originalCost - (originalCost * 0.08);
        } else {
            originalCost = 1000;
        }

        if (odometer > 100000 && (!makeModel.contains("Honda") || !makeModel.contains("Toyota"))) {
            originalCost = originalCost - (originalCost * 0.25);
        }

        return super.getValue();
    }

    //SETTERS

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
}
