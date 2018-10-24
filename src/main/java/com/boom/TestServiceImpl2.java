package com.boom;

import java.util.HashMap;
import java.util.Map;

public class TestServiceImpl2 implements TestService {

    private static String x = "123";

    @Override
    public void test() {

    }

    public static void main(String[] args) {
        System.out.println(x);
        System.out.println(x);
        Map map = new HashMap();
    }
}

