package com.cp.topic2.array.max_min_of_array;

public class MaxMinPairImpl implements MaxMinPair {

	@Override
	public Pair getMaxMinPair(int[] arr) {
		Pair pair = new Pair();

		if (arr.length == 1) {
			pair.min = arr[0];
			pair.max = arr[0];

		}
		if (arr.length == 2) {
			if (arr[0] > arr[1]) {
				pair.min = arr[1];
				pair.max = arr[0];
			} else {
				pair.min = arr[0];
				pair.max = arr[1];
			}

		}

		pair.min = arr[0];
		pair.max = arr[1];
		int j = 0;
		for (int i = 2; i < arr.length; i++) {
			System.out.println(++j);
			if (arr[i] > pair.max) {
				pair.max = arr[i];

			} else if (arr[i] < pair.min)

			{
				pair.min = arr[i];
			}
		}

		return pair;
	}

	@Override
	public Pair getMaxMinInPair(int[] arr) {
		Pair pair = new Pair();
		int i;
		if (arr.length % 2 == 0) {
			if (arr[0] > arr[1]) {
				pair.min = arr[1];
				pair.max = arr[0];
			}
			i = 2;
		} else {
			pair.min = arr[0];
			pair.max = arr[0];
			i = 1;
		}
		int j = 0;
		while (i < arr.length - 1) {
			System.out.println(++j);
			if (arr[i] > arr[i + 1]) {
				if (arr[i] > pair.max) {
					pair.max = arr[i];
				}
				if (arr[i + 1] < pair.min) {
					pair.min = arr[i + 1];
				}

			} else if (arr[i + 1] > arr[i]) {
				if (arr[i + 1] > pair.max) {
					pair.max = arr[i + 1];
				}
				if (arr[i] < pair.min) {
					pair.min = arr[i];
				}
			}
			i += 2;
		}

		return pair;
	}

}
