package com.vld.leetcode.strings.easy.p1108;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DefangingIPAddressTest {
    DefangingIPAddress defangingIPAddress;

    @BeforeEach
    void init() {
        defangingIPAddress = new DefangingIPAddress();
    }

    @Test
    void test1() {
        assertEquals("1[.]1[.]1[.]1", defangingIPAddress.defangIPaddr ("1.1.1.1"));
    }
}