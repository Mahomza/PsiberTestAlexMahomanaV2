package com.util;

import com.model.BaseRebate;
import com.model.PrimaryRebate;
import com.model.RebateType;
import com.model.SecondaryRebate;
import com.model.TertiaryRebate;

public class RebateUtil {

	RebateType rebateType;

	public RebateUtil(RebateType rebateType) {
		this.rebateType = rebateType;
	}

	public BaseRebate getRebateType(int age) {
		if (PrimaryRebate.isValidAge(age)) {
			return new PrimaryRebate(rebateType.getPrimary());

		} else if (SecondaryRebate.isValidAge(age)) {
			return new SecondaryRebate(rebateType.getSecondary() + rebateType.getPrimary());

		} else if (TertiaryRebate.isValidAge(age)) {
			return new TertiaryRebate(rebateType.getTertiary() + rebateType.getPrimary());

		} else {
			return null;
		}

	}

}
