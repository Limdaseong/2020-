package com.kita.first.level7;

public class Firebat extends Unit implements AttackUnit{
	private int damage;
	public Firebat() {
		super("파이어뱃", 60);
		damage =7;
	}
	@Override
	public void attack(Unit u) {
		if(u== this) {return;}
		System.out.println("파이어");
		u.getDamage(damage);
	}
}
