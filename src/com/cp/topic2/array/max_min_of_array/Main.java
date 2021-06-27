package com.cp.topic2.array.max_min_of_array;

public class Main {
	// Q:Find the maximum and minimum element in an array
//	Input: arr[] = {7, 10, 4, 3, 20, 15} 
//	k = 3 
//	Output: 7
//
//	Input: arr[] = {7, 10, 4, 3, 20, 15} 
//	k = 4 
//	Output: 10 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 6, 4, 85, 3, 6, 43 };
		MaxMinPair maxMinPair = new MaxMinPairImpl();
		//Pair pair = maxMinPair.getMaxMinPair(arr);
		Pair pair = maxMinPair.getMaxMinInPair(arr);
		System.out.println("arr length :" + arr.length);
		System.out.println(pair);
	}

}
