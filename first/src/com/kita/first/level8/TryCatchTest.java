package com.kita.first.level8;

public class TryCatchTest {
	public static void main(String[] args) {

		meth();
	}
	
	public static int div(int n1, int n2) throws Exception {
		return n1/n2;
		
		//meth2();
		
		System.out.println("dddd");
		
		div(10,2);
	}

	public static void meth2() {
		Class.forName("dsddd");
	}

	public static void meth() {
		int result =2;
		try {
			//result = 10/0;
			
			Class.forName("");
			} catch(ClassNotFoundException e) {
			
		}catch(
	Exception e){
		e.printStackTrace();
		System.out.println("예외가 발생하였습니다.");
	}finally
	{
		System.out.println("finally");
	}System.out.println("result : "+result);System.out.println("종료!");

}
