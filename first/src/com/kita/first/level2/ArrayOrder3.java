package com.kita.first.level2;

public class ArrayOrder3 {
	public static void main(String[] args) {

		int[] arr = { 29, 33, 15, 88, 5, 46, 92, 1, 19 };
		int temp;
		for (int z = 0; z < arr.length; z++) {
			for (int i = 0; i < arr.length-z-1; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		for(int r=0;r<arr.length;r++) {
			System.out.print(arr[r]+" ");
		}
	}
}
