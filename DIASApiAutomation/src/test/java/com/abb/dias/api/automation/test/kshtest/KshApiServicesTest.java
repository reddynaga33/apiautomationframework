package com.abb.dias.api.automation.test.kshtest;

import java.lang.reflect.Method;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.abb.dias.api.automation.core.report.ExtentsReport;
import com.abb.dias.api.automation.page.kshpages.KshApiServicesPage;

public class KshApiServicesTest extends KshApiServicesPage{

    @BeforeTest
	//@BeforeTest
	public void beforetest() {

		ExtentsReport.configureReport();

	}
    @Test
	//@Test
	public void runtest() throws InterruptedException {


		executeKshApisServices();

	}

@AfterTest
	//@AfterTest
	public void aftertest() {

		ExtentsReport.endTest();


	}

    @AfterMethod
	//@AfterMethod
	public void afterMethod(ITestResult result,Method testName) {   		
		ExtentsReport.getResult(result,testName.getName());

	}





}
