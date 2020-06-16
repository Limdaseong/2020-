package com.kita.first.mission;

import java.util.Scanner;

public class Mission5_ {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력해 주세요: (0~100)");
		int score = scan.nextInt();
		scan.close();
		
		if(score > 100 || score < 0) {
			System.out.println("잘 못 입력하였습니다.");
			
		} else if(score >= 90) {
			System.out.print("A");
			
		} else if(score >= 80) {
			System.out.print("B");
			
		} else if(score >= 70) {
			System.out.print("C");
			
		} else {
			System.out.print("D");
		}
		
		if(score == 100) {
			System.out.print("+");
		} else if(score >= 70 && score <= 100){
			int mod = score % 10;
			
			if(mod >= 7) {
				System.out.print("+");	
			} else if(mod <= 3) {
				System.out.print("-");
			}
		}
		System.out.println("입니다.");
		
	}
}
