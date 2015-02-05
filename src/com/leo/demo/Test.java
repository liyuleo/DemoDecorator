package com.leo.demo;

public class Test {

	public static void main(String[] args) {
		Clothes clothes = new Clothes();
		Weapon weapon = new Weapon();
		Shoes shoes = new Shoes();
		
		Equiment equiment1 = new RedStone(clothes);
		Equiment equiment2 = new RedStone(new BlueStone(shoes));
		Equiment equiment3 = new RedStone(new BlueStone(new YellowStone(weapon)));
		
		System.out.println(equiment1.getDescrible()+":"+equiment1.getPower());
		System.out.println(equiment2.getDescrible()+":"+equiment2.getPower());
		System.out.println(equiment3.getDescrible()+":"+equiment3.getPower());
	}

}
