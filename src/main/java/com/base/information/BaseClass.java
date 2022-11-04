package com.base.information;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	@BeforeSuite
	public void configBS() {
		System.out.println("Calling the BeforeSuite...");
	}
	@BeforeClass
	public void configBC() {
		System.out.println("Calling the BeforeClass....");
	}
	@BeforeMethod
	public void configBM() {
		System.out.println("Calling the BeforeMethod...");
	}
	@BeforeTest
	public void configBT() {
		System.out.println("calling the BeforeTest...");
	}
	@AfterSuite
	public void configAS() {
		System.out.println("Calling the AfterSuite...");
	}
	@AfterClass
	public void configAC() {
		System.out.println("Calling the AfterClass...");
	}
	@AfterMethod
	public void configAM() {
		System.out.println("Calling the AfterMethod...");
	}
	@AfterTest
	public void configAT() {
		System.out.println("Calling the AfterTest..");
	}

}
