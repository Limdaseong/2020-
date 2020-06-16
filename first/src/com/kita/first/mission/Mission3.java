package com.kita.first.mission;

import java.util.Scanner;

public class Mission3 {
	public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in);
	System.out.print("성별을 입력해 주세요 : (남/여)");
	String name = scan.next();
	System.out.print("키를 입력해 주세요 : ");
	int height = scan.nextInt();
	
	if(name.equals("남")) {
		if(height == 160)  {
			System.out.print("평균입니다.");
		}else if (height > 160) {
					System.out.print("평균 초과입니다.");
		}else  {
					System.out.println("평균 미만입니다.");
		}
	} else if(name.equals("여"))  {
		if(height == 150) {
			System.out.print("평균입니다.");
			}else if (height > 150) {
				System.out.print("평균 초과입니다.");
			}else  {
				System.out.print("평균 미만입니다.");
			}
	} else {
		System.out.print("성별을 잘 못 입력하셨습니다.");
	}
	scan.close();	
	}
	
}
