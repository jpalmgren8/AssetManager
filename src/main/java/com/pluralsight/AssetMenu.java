package com.pluralsight;

import java.util.ArrayList;

public class AssetMenu {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("2 Story Townhouse", "10/28/25", 90000, "742 Evergreen Terrace", 2, 1000, 1300));
        assets.add(new House("3 Story Studio Loft", "10/28/25", 200000, "31 Spooner Street", 4, 2000, 2200));

        assets.add(new Vehicle("Julian's Sedan", "10/28/25", 9000, "Chevy Impala", 2012, 90000));
        assets.add(new Vehicle("Noah's Sedan", "10/28/25", 20000, "Hyundai Elantra", 2018, 95000));

        for (Asset a : assets) {
            System.out.println(a.getValue());
        }
    }
}
