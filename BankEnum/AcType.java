package com.BankEnum;

public enum AcType {
saving,current,demat;

@Override
public String toString() {
	return super.name().toUpperCase();
}
}
