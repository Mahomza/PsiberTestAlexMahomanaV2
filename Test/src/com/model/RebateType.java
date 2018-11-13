package com.model;

public class RebateType {
	int primary;
	int secondary;
	int tertiary;

	public RebateType(int primary, int secondary, int tertiary) {
		this.primary = primary;
		this.secondary = secondary;
		this.tertiary = tertiary;
	}

	public int getPrimary() {
		return primary;
	}

	public int getSecondary() {
		return secondary;
	}

	public int getTertiary() {
		return tertiary;
	}
}
