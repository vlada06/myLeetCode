package com.vld.leetcode.week3.p2108;

public class FindFirstPalindrome {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }

    private boolean isPalindromeInitial(String word) {
        char[] charz = word.toCharArray();
        int wordLength = word.length();
        int count = 0;
        String firstHalf = word.substring(0, wordLength / 2);
        String secondHalf = word.substring(wordLength - wordLength / 2, wordLength);

        for (int i = 0; i < wordLength / 2; i++) {
            if (firstHalf.charAt(i) == secondHalf.charAt(secondHalf.length() - 1 - i)) {
                count++;
            }
        }
        return count == wordLength / 2;
    }

    boolean isPalindrome(String word) {
        int i = 0, j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
