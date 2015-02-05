package com.leo.demo;

public class BlueStone implements DecoratorEquiment {
	private Equiment mEquiment;

	public BlueStone(Equiment equiment) {
		mEquiment = equiment;
	}
	@Override
	public String getDescrible() {
		return mEquiment.getDescrible() + "蓝宝石 ";
	}

	@Override
	public int getPower() {
		return mEquiment.getPower() + 10;
	}

}
