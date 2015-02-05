package com.leo.demo;

public class YellowStone implements DecoratorEquiment {
	private Equiment mEquiment;

	public YellowStone(Equiment equiment) {
		mEquiment = equiment;
	}
	@Override
	public String getDescrible() {
		return mEquiment.getDescrible() + "黄宝石 ";
	}

	@Override
	public int getPower() {
		return mEquiment.getPower() + 5;
	}

}
