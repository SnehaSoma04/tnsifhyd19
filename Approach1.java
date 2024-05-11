package com.sic.demo;

public class Approach1 {
	String batsman = "virat kohli";
	static String bowler = "bhumrah";
	void display() {
		System.out.println("cricket");
	}
	static String display1() {
		return "Teams";
	}
	public static void main(String[] args) {
		Approach1 a1 = new Approach1();
		System.out.println(a1.batsman);
		System.out.println(a1.bowler);
		a1.display();
		Approach1.display1();
	}

}
