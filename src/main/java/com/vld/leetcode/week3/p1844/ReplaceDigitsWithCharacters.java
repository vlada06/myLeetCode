package com.vld.leetcode.week3.p1844;

public class ReplaceDigitsWithCharacters {

    public String replaceDigits(String s) {
        char[] charz = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        String odOneLast = "";
        if(s.length()%2 == 1){
            odOneLast = s.substring(s.length()-1);
        }

        for (int i = 0; i < charz.length; i++) {
            if (i%2 ==1){
                sb.append(shift(charz[i-1], charz[i]));
            }
        }
        sb.append(odOneLast);
        return sb.toString();
    }

    private String shift(char odd, char even) {
        int i = (int) odd;
        int j = i + even -'0';
        StringBuffer sb = new StringBuffer();
        sb.append(odd)
                .append(String.valueOf((char) j));
        return sb.toString();
    }
}
