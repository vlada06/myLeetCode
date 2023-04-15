package com.vld.leetcode.week1.p1603;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParkingSystemTest {
    ParkingSystem parkingSystem;

    @Test
    void test1() {
        int big = 1;
        int medium = 1;
        int small = 0;
        parkingSystem = new ParkingSystem(big, medium, small);
        assertTrue(parkingSystem.addCar(1));
        assertTrue(parkingSystem.addCar(2));
        assertFalse(parkingSystem.addCar(3));
        assertFalse(parkingSystem.addCar(1));
    }

    @Test
    void test2() {
        int big = 0;
        int medium = 0;
        int small = 2;
        parkingSystem = new ParkingSystem(big, medium, small);
        assertFalse(parkingSystem.addCar(1));
        assertFalse(parkingSystem.addCar(2));
        assertTrue(parkingSystem.addCar(3));
    }
}


