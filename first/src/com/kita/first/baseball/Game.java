package com.kita.first.baseball;

import java.util.Scanner;

public class Game {
	
	public static void main(String[] args) {
		int gameCnt =3;
		Baseball ball = new Baseball(gameCnt);		
		MyBall myBall = new MyBall(gameCnt);
		
		myBall.setNumbers(); 
		int val = ball.get(0);//0번째 인덱스 값 리턴
		//숫자1: 3
		
		
	}
}
