package com.press;

import org.junit.Assert;
import org.junit.Test;

public class BoubleSortTest {

    private BoubleSort b = new BoubleSort();

    @Test
    public void sortTest(){
        int[] mass = {9,8,7,6,5,4,3,2,1};
        int[] result = {1,2,3,4,5,6,7,8,9};
        int[] actual = b.sort(mass);
        Assert.assertArrayEquals(result, actual);
    }

    @Test
    public void isNullArrayTest() {
        int[] arr = new int[0];
        int[] result = new int[0];
        int[] actual = b.sort(arr);
        Assert.assertArrayEquals(result, actual);
    }

    @Test
    public void zeroArrayTest(){
        int[] arr = {0,0,0,0,0};
        int[] result = {0,0,0,0,0};
        int[] actual = b.sort(arr);
        Assert.assertArrayEquals(result, actual);
    }
}
