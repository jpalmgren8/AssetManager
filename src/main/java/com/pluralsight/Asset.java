package com.pluralsight;

public abstract class Asset {

    protected String description;
    protected String dateAcquired;
    protected double originalCost;

    public Asset(String description, String dateAcquired, double originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    @Override
    public String toString() {
        return "Asset{" +
                "description='" + description + '\'' +
                ", dateAcquired='" + dateAcquired + '\'' +
                ", originalCost=" + originalCost +
                '}';
    }

    // GETTERS

    public String getDescription() {
        return description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    // ABSTRACT method for getting value

    public abstract double getValue();

    // SETTERS

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }
}
