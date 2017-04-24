package com.practice;

import java.math.BigInteger;

public class PowerCalculator {

	private static BigInteger powerRecursive(BigInteger base, int index) {
		if (index == 0)
			return BigInteger.ONE;
		if (index == 1)
			return base;
		BigInteger result = BigInteger.ONE;
		if (index % 2 == 0) {
			BigInteger powerHalfIndex = powerRecursive(base, index / 2);
			result = powerHalfIndex.multiply(powerHalfIndex);
		} else {
			result = base.multiply(powerRecursive(base, (index - 1)));
		}
		return result;
	}

	private static BigInteger powerNormal(BigInteger base, int index) {
		BigInteger result = BigInteger.ONE;
		for (int i = 0; i < index; i++) {
			result = result.multiply(base);
		}
		return result;
	}

	public static void main(String args[]) {
		BigInteger base = new BigInteger("2");
		int index = 500000;
		long startR = System.currentTimeMillis();
		BigInteger resultR = powerRecursive(base, index);
		long endR = System.currentTimeMillis();
		System.out.println("recursive time : " + (endR - startR));
		long startN = System.currentTimeMillis();
		BigInteger resultN = powerNormal(base, index);
		long endN = System.currentTimeMillis();
		System.out.println("normal time : " + (endN - startN));
	}

}
