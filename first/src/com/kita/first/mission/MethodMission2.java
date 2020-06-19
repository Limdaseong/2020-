package com.kita.first.mission;

public class MethodMission2 {
	public static void main(String[] args) {
		// printstar(6);
		// printStarSquare(5);
		// printStarTriangle(5);
		printStarTriangleReverse(5);

	}

	public static void printstar(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	public static void printStarSquare(int num) {
		for (int i = 0; i < num; i++) {
			printstar(num);
		}
	}

	public static void printStarTriangle(int num) {
		for (int i = 1; i <= num; i++) {
			printstar(i);
		}
	}

	public static void printChar(char ch, int num) {
		for (int z = 0; z < num; z++) {
			System.out.print(ch);
		}
	}

	public static void printStarTriangleReverse(int num) {
		for (int i = num-1; i >=0; i--) {
			printChar(' ', i);
			printstar(num - i);
		}
	}
}
