package com.kita.first.mission;

import java.util.Scanner;

public class MethodMission1 {
	public static void main(String[] args) {
		guguDan(4);
		guguDan(2, 6);

	}

	public static void guguDan(int sDan, int eDan) {
		for (int i = sDan; i <= eDan; i++) {
			guguDan(i);
		}
		System.out.println();

	}

	public static void guguDan(int num) {
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}
		System.out.println();
	}
}
