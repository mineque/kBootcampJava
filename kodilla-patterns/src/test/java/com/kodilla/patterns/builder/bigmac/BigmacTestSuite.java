package com.kodilla.patterns.builder.bigmac;

import org.junit.Test;

public class BigmacTestSuite {
    @Test

    public void testBigMac() {

        BigMac bigmac = new BigMac.BigMacBuilder()
                .burgers(10)
                .rollWithSesame(false)
                .sauce("SAUCE_1000_ISLANDS")
                .ingredient("SALAD")
                .ingredient("BACON")
                .prepare();
        System.out.println(bigmac);
    }
}
