package com.leo.demo;

public class Weapon implements Equiment {

	@Override
	public String getDescrible() {
		return "武器 ";
	}

	@Override
	public int getPower() {
		return 100;
	}

}
