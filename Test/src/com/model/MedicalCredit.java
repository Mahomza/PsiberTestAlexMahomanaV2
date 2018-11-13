package com.model;

public class MedicalCredit {

	int mainMember;
	int fisrtDependent;
	int secondDependent;

	public MedicalCredit(int mainMember, int fisrtDependent, int secondDependent) {
		this.mainMember = mainMember;
		this.fisrtDependent = fisrtDependent;
		this.secondDependent = secondDependent;
	}

	public int getMainMember() {
		return mainMember;
	}

	public int getFisrtDependent() {
		return fisrtDependent;
	}

	public int getSecondDependent() {
		return secondDependent;
	}

	public int CalculateTaxCredit(int numberOfDependent) {
		if (numberOfDependent == 0) {
			return mainMember;
		} else {
			return mainMember + fisrtDependent + ((numberOfDependent - 1) * secondDependent);
		}
	}
}
