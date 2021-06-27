package com.cp.topic1.reversearray;

public class Main {
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5 };
		ReverseArray rev = new ReverseArray();
		rev.reverseWithforLoop(arr); 
		System.out.println("\n");
		rev.reverseWithWhilLoop(arr);
		
	}


}
