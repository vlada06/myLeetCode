package com.vld.leetcode.week1.p1603;

public class ParkingSystem {

    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        boolean isCarAdded = false;
        switch (carType) {
            case 1:
                if (this.big > 0) {
                    this.big--;
                    isCarAdded = true;
                }
                break;
            case 2:
                if (this.medium > 0) {
                    this.medium--;
                    isCarAdded = true;
                }
                break;
            case 3:
                if (this.small > 0) {
                    this.small--;
                    isCarAdded = true;
                }
                break;
        }
        return isCarAdded;
    }
}
