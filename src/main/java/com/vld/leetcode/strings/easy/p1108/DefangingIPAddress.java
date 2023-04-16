package com.vld.leetcode.strings.easy.p1108;

/**
 * date: 16/04/2023
 * time: 21:06
 */

public class DefangingIPAddress {
        public String defangIPaddr(String address) {
            return address.replace(".", "[.]");
        }
 }
