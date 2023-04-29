package com.bank;

public class Date {
	private int date;
	private int month;
	private int year;
	public Date(int date, int month, int year) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Date:" + date + "/" + month + "/" + year;
	}

}
