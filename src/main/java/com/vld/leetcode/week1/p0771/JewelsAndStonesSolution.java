package com.vld.leetcode.week1.p0771;

public class JewelsAndStonesSolution {
    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;

        char[] jewelsArray = jewels.toCharArray();
        char[] stonesArray = stones.toCharArray();
        for (int i = 0; i < jewelsArray.length; i++) {
            for (int j = 0; j < stonesArray.length; j++) {
                if (jewelsArray[i] == stonesArray[j]){
                    result++;
                }
            }
        }
        return result;
    }
}
