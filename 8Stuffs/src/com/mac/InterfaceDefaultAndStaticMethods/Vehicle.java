package com.mac.InterfaceDefaultAndStaticMethods;

public interface Vehicle {
	public default void wheel() {
		System.out.println("2");
	}
	static void color() {
		System.out.println("vehicle color");
	}
}
