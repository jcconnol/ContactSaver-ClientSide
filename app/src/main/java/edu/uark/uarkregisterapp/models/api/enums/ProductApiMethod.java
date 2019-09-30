package edu.uark.uarkregisterapp.models.api.enums;

import java.util.HashMap;
import java.util.Map;

import edu.uark.uarkregisterapp.models.api.interfaces.PathElementInterface;

public enum ProductApiMethod implements PathElementInterface {
	NONE(""),
	BY_CONTACT_NAME("byContactId");

	@Override
	public String getPathValue() {
		return value;
	}

	private String value;

	ProductApiMethod(String value) {
		this.value = value;
	}
}