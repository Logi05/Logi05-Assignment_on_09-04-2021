package com.demo;

import java.util.function.Supplier;

public class Example2 {
	public static void main(String[] args) {
		Supplier<Integer> s = () -> {
			// String id ="";
			int id = 0;
			for (int i = 1; i <= 6; i++) {
				id = id + (int) (Math.random() * 100000);
			}
			return id;
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}
}
