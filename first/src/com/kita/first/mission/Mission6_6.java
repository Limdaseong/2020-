package com.kita.first.mission;

public class Mission6_6 {
	public static void main(String[] args) {
		int star = 5;
		for (int i = 0; i < star; i++) {
			for (int p = 0; p <= i; p++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
//한개씩 늘어나는 별찍기