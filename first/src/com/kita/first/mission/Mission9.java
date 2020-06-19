package com.kita.first.mission;

public class Mission9 {
	public static void main(String[] args) {
		// arr 1~100 값이 들어가도록 해주세요 순서대로
		// 0번에 1____
		// 각 방에 있는 모든 값을 더한 후 결과값 출력
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 2;
		}
		int sum = 0;
		for (int r = 0; r < arr.length; r++) {
			sum += arr[r];
		}
		System.out.println(sum);

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d", arr[i]);
			if (i != arr.length - 1) {
				System.out.print(", ");
			}
		}
	}
}
