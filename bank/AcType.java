package com.bank;

public enum AcType {
saving,current,demat;

@Override
public String toString() {
	return super.name().toUpperCase();
}
}
