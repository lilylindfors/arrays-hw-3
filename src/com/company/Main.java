package com.company;

public class Main {

    public static void main(String[] args) {
	int[] VALUES = {-3, 2, 5, 4, 7};
	boolean RESULT = true;
	for (int n = 1; RESULT && n < 5; n ++) {
	    if (VALUES[n] < VALUES[n-1]) RESULT = false;
    }
        System.out.println(RESULT);

    }
}
