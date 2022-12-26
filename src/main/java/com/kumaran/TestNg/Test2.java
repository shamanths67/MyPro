package com.kumaran.TestNg;

import org.testng.annotations.Test;

public class Test2 {

	public void loginPage() {
		System.out.println("Im the One to first");
		System.out.println("Im the One to 1");
		System.out.println("Im the One to 2");
		
	}
	@Test
	public void moduleOne() {
		System.out.println("first in DB");
	}
	@Test(dependsOnMethods = "moduleOne")
	public void moduleSecond() {
		System.out.println("second in DB");
		System.out.println("second1 in DB");
		System.out.println("second2 in DB");
		
	}
}
