package com.kita.first.level3;

import java.util.Arrays;

public class MyListTest {
	public static void main(String[] args) {
		MyList list = new MyList();
		list.add(10);
		list.add(15);
		list.add(20);
		// list.add(1,12);

		int len = list.size(); // 2
		System.out.println(len);
		int val = list.get(1); // 15
		System.out.println(val);
		val = list.get(0); // 10
		System.out.println(val);

		// list.removeLast();
		list.removeSelectIndex(1);
	}
}

class MyList {

	private int[] arr;

	MyList() {
		init();
	}

	private void init() {
		arr = new int[0];
	}

	void add(int num) {
		int[] temp = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		temp[arr.length] = num;
		arr = temp;
		System.out.println(Arrays.toString(arr));
	}

	void add(int index, int num) {
		int[] temp = new int[arr.length + 1];
		for (int i = 0; i < index; i++) {
			temp[i] = arr[i];
		}
		for (int i = index; i < arr.length; i++) {
			temp[index + 1] = arr[index];
		}
		temp[index] = num;
		arr = temp;
		System.out.println(Arrays.toString(arr));
	}

	int size() {
		return arr.length;
	}

	int get(int num) {
		return arr[num];
	}

	void removeLast() {
		int[] temp = new int[arr.length - 1];
		for (int i = 0; i < arr.length - 1; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
		System.out.println(Arrays.toString(arr));
	}

	void removeSelectIndex(int num) {
		int[] temp = new int[arr.length - 1];
		/*for (int i = 0; i < num; i++) {
			temp[i] = arr[i];
		}
		for (int i = num; i < arr.length-1; i++) {
			temp[i] = arr[i+1];
		}*/
		for(int i=0;i<arr.length;i++) {
			if(i<num) {
				temp[i] = arr[i];
			}else if(i>num){
				temp[i-1] = arr[i];
			}
		}
		arr = temp;
		System.out.println(Arrays.toString(arr));
	}

}