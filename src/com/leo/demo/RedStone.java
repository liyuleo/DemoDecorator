package com.leo.demo;

public class RedStone implements DecoratorEquiment {
	private Equiment mEquiment;

	public RedStone(Equiment equiment) {
		mEquiment = equiment;
	}

	@Override
	public String getDescrible() {
		return mEquiment.getDescrible() + "红宝石 ";
	}

	@Override
	public int getPower() {
		return mEquiment.getPower() + 15;
	}

}
