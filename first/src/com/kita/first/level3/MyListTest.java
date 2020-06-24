package com.kita.first.level3;

import java.util.Arrays;

public class MyListTest {
	public static void main(String[] args) {
		MyList list = new MyList();
		list.add(10);
		list.add(15);
		list.add(20);

		// int len = list.size(); // 2
		// System.out.println(len);
		// int val = list.get(1); // 15
		// System.out.println(val);
		// val = list.get(0); // 10
		// System.out.println(val);

		list.remove(0);
		list.add(1, 12);

		//MyArrays.print(list);
	}
}

class MyArrays {
	static void print(MyList list) {

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

	int size() {
		return arr.length;
	}

	int get(int num) {
		return arr[num];
	}

	void add(int num) {
		int[] temp = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		temp[arr.length] = num;
		arr = temp;
		add(arr.length, num);
	}

	void add(int idx, int num) {
		int[] temp = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			temp[i < idx ? i : i + 1] = arr[i];
		}
		temp[idx] = num;
		arr = temp;
	}

	/*
	 * int removeLast() { int[] temp = new int[arr.length - 1]; int saveCnt = 0; for
	 * (int i = 0; i < arr.length; i++) { if (i != arr.length - 1) { temp[i] =
	 * arr[i]; } else { saveCnt = arr[i]; } } arr = temp;
	 * System.out.println(Arrays.toString(arr)); return saveCnt; }
	 */

	/*
	 * int remove(int num) { int[] temp = new int[arr.length - 1]; for (int i = 0; i
	 * < arr.length; i++) { if (i < num) { temp[i] = arr[i]; } else { temp[i] =
	 * arr[i + 1]; } } int delVal = arr[num]; arr = temp; return delVal; }
	 * 
	 * int remove() { return remove(arr.length - 1); }
	 */

	int remove(int idx) {
		int[] temp = new int[arr.length - 1];
		for (int i = 0; i < arr.length; i++) {
			if (i < idx) {
				temp[i] = arr[i];
			} else {
				temp[i] = arr[i + 1];
			}
			temp[i] = arr[i < idx ? i : i + 1];
		}
		int delVal = arr[idx];
		arr = temp;
		return delVal;
	}

	int remove() {

		return remove(arr.length - 1);
	}

}