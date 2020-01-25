package com.press;

public class K_String {
    public int[] k_string(int k, int[] mass) {
        int[] mass2 = new int[mass.length];
        int n = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % k == 0) {
                mass2[n] = mass[i];
                n++;
            }
        }
        int[] mass3 = new int[n];
        for (int i = 0; i < n; i++) {
            mass3[i]=mass2[i];
        }
        return mass3;
    }
}
