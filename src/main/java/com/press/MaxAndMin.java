package com.press;


class MaxAndMin {
    public int[] maxmin(int[] mass) {
        if (mass == null) throw new NullPointerException();
        if(mass.length == 0){
            int[] extremum = new int[0];
            return extremum;
        }
        int max = 0, min = 0;
        for (int i = 0; i < mass.length; i++) {
            if (i == 0) {
                min = mass[i];
                max = mass[i];
            }
            if (mass[i] < min) min = mass[i];
            if (mass[i] > max) max = mass[i];
        }
        int[] extremum = new int[2];
        extremum[0] = min;
        extremum[1] = max;
        System.out.println(extremum[0]);
        System.out.println(extremum[1]);
        return extremum;
    }
}
