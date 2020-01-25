package com.press;

import org.junit.Assert;
import org.junit.Test;

public class K_StringTest {

    private K_String k = new K_String();

    @Test
    public void k_stringTest(){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] result = {2,4,6,8};
        int[] actual = k.k_string(2, arr);
        Assert.assertArrayEquals(result, actual);
    }

    @Test(expected = NullPointerException.class)
    public  void isValidTest(){
        k.k_string(0,null);
    }

    @Test
    public void zeroArrayTest(){
        int[] arr = {0,0,0,0,0};
        int[] result = {0,0,0,0,0};
        int[] actual = k.k_string(5,arr);
        Assert.assertArrayEquals(result, actual);
    }


}
