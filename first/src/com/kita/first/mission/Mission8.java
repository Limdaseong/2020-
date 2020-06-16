package com.kita.first.mission;

import java.util.Random;
import java.util.Scanner;

public class Mission8 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);

		System.out.print("랜덤값 10~90 을 맞추는 게임\n값을 입력하시오: ");
		int rVal = (int) (Math.random() * 81) + 10;
		while (true) {
			int count = scan.nextInt();
			if (count == rVal) {
				System.out.printf("정답입니다!! 정답은 %d", count);
				break;
			} else if (count > rVal) {
				System.out.println("DOWN");
			} else if (count < rVal) {
				System.out.println("UP");
			} else if (10 > count || 90 < count) {
				System.out.println("잘못된 값을 입력하셨습니다.");
			}
			System.out.print("숫자를 다시 입력하세요: ");
		}

	}
}
