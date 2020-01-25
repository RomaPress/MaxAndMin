package com.press;

import org.junit.Assert;
import org.junit.Test;

public class MaxAndMinTest {

    private MaxAndMin m = new MaxAndMin();

    @Test
    public void isEqualsTest() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = {1, 9};
        int[] actual = m.maxmin(arr);
        Assert.assertArrayEquals(result, actual);
    }

    @Test(expected = NullPointerException.class)
    public  void isValidTest(){
        m.maxmin(null);
    }

    @Test
    public void isNullArrayTest(){
        int[] arr = new int[0];
        int[] result = new int[0];
        int[] actual = m.maxmin(arr);
        Assert.assertArrayEquals(result, actual);
    }

    @Test
    public void zeroArrayTest(){
        int[] arr = {0,0,0,0,0};
        int[] result = {0,0};
        int[] actual = m.maxmin(arr);
        Assert.assertArrayEquals(result, actual);
    }
}
