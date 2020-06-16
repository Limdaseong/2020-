package com.kita.first.mission;

public class Mission6_7 {
	public static void main(String[] args) {
		int star = 4;
		/*for(int i=0;i<star;i++)
		{
			for(int p=star-1;p>i;p--) {
				System.out.print(" ");
			}
			for(int s=0;s<=i;s++) {
				System.out.print("*");
			}
			System.out.println("");
		}*/
		for(int i=1; i<=star; i++) {
			for(int z=star;z>0;z--) {
				System.out.print(i<z ? " " : "*");
			}
			System.out.println(" ");
		}
	}
}
//역순으로 한개씩 늘어나는 별찍기
