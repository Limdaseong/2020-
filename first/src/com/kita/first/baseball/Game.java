package com.kita.first.baseball;

public class Game {
	
	public static void main(String[] args) {
		int gameCnt =3;
		if(args.length != 0) {
			try {
				gameCnt = Integer.parseInt(args[0]);
			} catch(Exception e) {}
		}
		
		Baseball ball = new Baseball(gameCnt);		
		MyBall myBall = new MyBall(gameCnt);
		
		do {
		 myBall.setNumbers(); 
		} while (Checker.check(gameCnt,ball,myBall)); //0번째 인덱스 값 리턴
		//숫자1: 3
		
		System.out.println("게임 종료!");
	}
}
