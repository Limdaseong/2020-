package com.kita.first.level2;

public class NamedLoop {
	public static void main(String[] args) {

		Parent: for (int i = 0; i < 10; i++) {
			for (int z = 0; z < 20; z++) {
				if (z == 15) {
					break Parent;
				}
				System.out.printf("%d - %d\n", i, z);
			}
		}
	}
}