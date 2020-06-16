package com.kita.first.mission;

import java.util.Scanner;

public class Mission7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, sum = 0;

		while (true) {
			System.out.print("숫자를 입력(종료0):");
			String tmp = scan.nextLine();
			num = Integer.parseInt(tmp);

			if (num == 0) {
				break;
			}
			if (num % 2 == 0) {
				sum += num;
			}
		}
		scan.close();
		System.out.printf("합계 : %d", sum);
	}
}
//숫자를 입력하고 짝수끼리만 더해서 합계를 나타내는 반복문
