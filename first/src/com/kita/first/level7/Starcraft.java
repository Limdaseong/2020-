package com.kita.first.level7;

public class Starcraft {
	public static void main(String[] args) {
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Medic medic = new Medic();
		Firebat fb = new Firebat();
		
		fb.attack(m1);
		fb.attack(m1);
		fb.attack(m1);
		
		System.out.println(m1);
		
		m1.attack(fb);
		m1.attack(fb);
		
		System.out.println(fb);
		
		medic.heal(fb);
		medic.heal(m1);
		
		System.out.println(fb);
		System.out.println(m1);
	}
}
