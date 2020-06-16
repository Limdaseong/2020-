package com.kita.first.mission;

public class Mission6_1 {
	public static void main(String[] args) {
		int dan = 4;

		for (int num = 9; num < 18; num++) {
			System.out.printf("%d * %d = %d\n", dan, num - 8, dan * (num - 8));
		}
	}
}
