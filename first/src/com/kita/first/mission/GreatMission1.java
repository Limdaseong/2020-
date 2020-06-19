package com.kita.first.mission;

import java.util.Random;
import java.util.Scanner;

public class GreatMission1 {
	public static void main(String[] args) {
		final int LEN = 3;

		int[] rArr = new int[LEN];
		int[] myArr = new int[LEN];
		int count = 0;

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		for (int i = 0; i < rArr.length; i++) {
			rArr[i] = (int) (Math.random() * 9 + 1);
			for (int z = 0; z < i; z++) {
				if (rArr[i] == rArr[z]) {
					i--;
					break;
				}
			}
		}

		System.out.print("중복되지 않게 1~9의 숫자를 3번 입력하세요");

		while (true) {
			count++;
			int strike = 0;
			int ball = 0;
			for (int q = 0; q < myArr.length; q++) {
				int a = scanner.nextInt();
				myArr[q] = a;
				for (int x = 0; x < q; x++) {
					if (myArr[q] == myArr[x]) {
						System.out.printf("중복되었습니다. %d번 숫자를 다시 입력해주세요.", q);
						q = q - 1;
						break;
					}
				}
			}

			for (int i = 0; i < LEN; i++) {
				for (int z = 0; z < LEN; z++) {
					if (rArr[i] == myArr[z]) {
						if (i == z) {
							strike++;
						} else {
							ball++;
						}
					}
				}
			}
			if (strike == LEN) {
				System.out.printf("%d번째 끝에 정답!!",count);
				break;
			}
			System.out.printf("%d번째 입력은 스트라이크 : %d, 볼 : %d, 아웃 : %d입니다.\n", count, strike, ball, LEN - (strike + ball));
		}	
	}
}
