package com.kita.first.mission;

public class Mission6_4 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int p = 2; p < 10; p++) {
				System.out.printf("%d*%d=%d\t ", p, i, i * p);
			}
			System.out.println("");
		}
	}
}
