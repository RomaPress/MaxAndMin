package com.press;


class MaxAndMin {
    public int[] maxmin(int[] mass) {
        if (mass == null) throw new NullPointerException();
        if(mass.length == 0){
            return new int[0];
        }
        int max = mass[0], min = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < min) min = mass[i];
            if (mass[i] > max) max = mass[i];
        }
        return new int[2]{min, max};
    }
}
