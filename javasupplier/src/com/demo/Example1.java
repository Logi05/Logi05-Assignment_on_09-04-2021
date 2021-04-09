package com.demo;

import java.util.function.Consumer;

public class Example1 {
	public static void main(String[] args) {
		Consumer<Integer> conObj = (a) -> System.out.println(a);
		// int i = conObj.accept(4);
		conObj.accept(4);
		// System.out.println(i);
	}
}
