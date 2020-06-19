package com.kita.first.level2;

public class ArrayOrder {
	public static void main(String[] args) {
		int[] arr = { 29, 33, 15, 88, 5, 46, 92, 1, 19 };
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int z=i+1;z<arr.length;z++) {
				if(arr[i] > arr[z]) {
					temp = arr[i];
					arr[i] = arr[z];
					arr[z] = temp;
				}
			}
		}
		for(int r=0;r<arr.length;r++) {
			System.out.print(arr[r] +" ");
		}
	}
}
