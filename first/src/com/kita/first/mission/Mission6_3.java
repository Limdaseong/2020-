package com.kita.first.mission;

public class Mission6_3 {
	public static void main(String[] args) {
		for (int i = 26; i < 34; i++) {
			for (int r = 1; r < 10; r++) {
				System.out.printf("%d * %d = %d\n", i - 24, r, (i - 24) * r);
			}
			System.out.println("");
		}
	}
}
