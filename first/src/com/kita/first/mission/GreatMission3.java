package com.kita.first.mission;

import java.util.Scanner;

public class GreatMission3 {
	public static void main(String[] args) {
		int[][] arr = {
				{90, 100, 88}, //영어
				{34, 99,45}, //수학
				{98,65,87}//국어
		};
		
		Scanner scanner = new Scanner(System.in);
		int allSum = 0;
		float allAvr =0;
		
		for(int i=0;i<arr.length;i++) {
			int sum = 0;
			float avr = 0;
			String sub = scanner.nextLine();
			for(int z=0;z<arr[i].length;z++) {
				sum+=arr[i][z];
			}
			avr = (float)sum/arr[i].length;
			System.out.printf("%s 합계: %d 평균: %.1f",sub,sum,(float)sum/arr[i].length);
			allSum+=sum;
			allAvr+=avr;
		}
		System.out.printf("\n전체 합계: %d, 평균: %.1f",allSum,(float)allAvr/arr.length);
		
		
		
	}
}
