package com.vld.leetcode.week2.p2103;

import java.util.HashSet;
import java.util.Set;

public class RingsAndRods {
    public int countPoints(String rings) {
        int count = 0;
        int noOfRings = rings.length() / 2;
        String[] ringArray = new String[noOfRings];
        // get rings as array of 2 char strings
        for (int i = 0; i < noOfRings; i++) {
            ringArray[i] = rings.substring(2 * i, 2 * i + 2);
        }

        // outer loop : iterate through sticks
        for (int i = 0; i < 10; i++) {
            Set<Character> colors = new HashSet<>();
            //inner loop: iterate through rings
            for (int j = 0; j < noOfRings; j++) {
                if (Integer.parseInt(ringArray[j].substring(1)) == i) {
                    // if a stick has a ring, increase the count.
                    colors.add(ringArray[j].charAt(0));
                }
            }
            if (colors.size() == 3)
                count++;
        }
        return count;
    }
}
