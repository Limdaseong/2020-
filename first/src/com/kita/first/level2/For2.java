package com.kita.first.level2;

public class For2 {
	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {

			for (int z = 0; z < 5; z++) {

				for (int r = 0; r < 3; r++) {
					System.out.printf("%d - %d - %d\n", i, z, r);
				}
			}
		}
	}
}
//0-0-0 끝에서 부터 1씩 오르는 반복문