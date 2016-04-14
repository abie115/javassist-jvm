package com.abiewska.jvm;

public class MyClass {
	public static Integer sleep(Integer time) {

		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return time;

	}
}
