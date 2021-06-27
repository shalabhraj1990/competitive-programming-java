package com.cp.topic1.array.reversearray;

public class ReverseArray {
	public void reverseWithforLoop(int[] arr) {
		int temp;
		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public void reverseWithWhilLoop(int[] arr) {
		int temp;
		int start = 0;
		int end = arr.length -1;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
