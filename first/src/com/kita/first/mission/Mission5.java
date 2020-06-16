package com.kita.first.mission;

import java.util.Scanner;

public class Mission5 {
	public static void main(String[] args) {
		/* 
		 정수를 입력해 주세요: (0~100)
		 90점 이상 A
		 80점 이상 B
		 70점 이상 C
		 나머지는  D입니다.
		 
		 일의 자리 수가 7점 이상이면 +
		 일의 자리 수가 3점 이하이면 -
		 예를 들어 95 > A
		 */
		System.out.print("점수를 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		int grd = scan.nextInt();
		scan.close();
		
		switch(grd/10) {
		case 10:
			if(grd > 100) {
				System.out.println("잘못된 값입니다.");
				break;
			}
			System.out.println("A+입니다.");
			break;
		case 9:
			System.out.print("A");
			break;
			
		case 8:
			System.out.print("B");
			break;
			
		case 7:
			System.out.print("C");
			break;
			
		case 6: case 5: case 4: case 3: case 2: case 1: case 0:
			System.out.print("D");
			break;
		default:
			System.out.println("잘못된 값입니다.");
		}
		if(grd < 70) {
			System.out.println("입니다.");
		}else if((grd % 10) <= 3) {
			System.out.println("-입니다.");
		} else if((grd % 10) >= 7) {
			System.out.println("+입니다.");
		} else {
			System.out.println("입니다.");
		}
	}
	/*public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력해 주세요: (0~100)");
		int score = scan.nextInt();
		scan.close();
		
		if(score > 100 || score < 0) {
			System.out.println("잘 못 입력하였습니다.");
			
		} else if(score < 70) {
			System.out.print("D");
			
		} else if(score < 80) {
			System.out.print("C");
			
		} else if(score < 90) {
			System.out.print("B");
			
		} else {
			System.out.print("A");
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
		
	}*/
}
