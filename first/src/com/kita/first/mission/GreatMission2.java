package com.kita.first.mission;

import java.util.Scanner;

public class GreatMission2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] mod = { "사이다", "콜라", "환타", "마운틴듀", "초코우유", "바나나우유" };
		int[] cost = { 500, 600, 700, 800, 400, 400 };
		int sum =0;
		
		System.out.println("메뉴");
		System.out.println("1. 사이다	\t500원");
		System.out.println("2. 콜라      \t600원");
		System.out.println("3. 환타      \t700원");
		System.out.println("4. 마운틴듀 \t800원");
		System.out.println("5. 초코우유 \t400원");
		System.out.println("6. 바나나우유 \t400원\n");
		
		while(true) {
			System.out.print("메뉴를 선택하세요(종료:0) : ");
			int menu = scanner.nextInt();
			if(menu == 0) {
				break;
			} else if(menu <0 || menu > mod.length) {
				continue;
			}
			System.out.println(mod[menu-1]+" "+cost[menu-1]+"원");
			sum += cost[menu-1];
		}
		System.out.print("-----종료!------\n총 "+sum+"원 사용");

	}
}
