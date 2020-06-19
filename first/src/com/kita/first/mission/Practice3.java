package com.kita.first.mission;

import java.util.Random;

public class Practice3 {
	public static void main(String[] args) {
		int len = 3;
		int[] arr = new int[len];
		// 1~9 사이의 랜덤한 값을 중복되지 않게 arr배열 크기만큼 초기화한다.
		Random random = new Random();
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*9)+1;
			for(int z=0;z<i;z++) {
				if(arr[i] == arr[z]) {
					i--;
					break;
				}
			}
		}
		for(int r=0;r<arr.length;r++) {
			System.out.print(arr[r]+" ");
		}
	}
}
