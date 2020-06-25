package com.kita.first.baseball;

import java.util.*;

import com.kita.first.level2.Array;

public class MyBall {
	private int[] myArr;
	private Scanner scanner = new Scanner(System.in);;

	public MyBall(int num) {
		init(num);
	}

	private void init(int num) {
		myArr = new int[num];
	}

	public void setNumbers() {
		for (int i = 0; i < myArr.length; i++) {
			System.out.printf("숫자 %d: ", i+1);
			myArr[i] = scanner.nextInt();
			try {
				myArr[i] = Integer.parseInt(val)
			} catch (Exception e) {
				myArr[i] =0;
			}
			if(myArr[i] == 0) {
				i--;
				System.out.println("숫자만 입력하세요.");
				continue;
			}
			if(myArr[i] < i || myArr[i] > 9) {
				i--;
				System.out.println("숫자만 입력하세요");
				continue;
			}
			for (int z = 0; z < i; z++) {
				if (myArr[z] == myArr[i]) {
					System.out.println("중복된 값이 존재합니다.");
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(myArr));
	}
	
	void start() {
		while(true) {
			
		}
	}
}
