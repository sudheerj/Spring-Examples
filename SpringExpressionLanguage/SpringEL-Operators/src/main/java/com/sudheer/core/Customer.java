package com.sudheer.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customerBean")
public class Customer {

	//Relational operators
	
	@Value("#{1 == 1}") //true
	private boolean testEqual;
	
	@Value("#{1 != 1}") //false
	private boolean testNotEqual;
	
	@Value("#{1 < 1}") //false
	private boolean testLessThan;
	
	@Value("#{1 <= 1}") //true
	private boolean testLessThanOrEqual;
	
	@Value("#{1 > 1}") //false
	private boolean testGreaterThan;
	
	@Value("#{1 >= 1}") //true
	private boolean testGreaterThanOrEqual;

	//Logical operators , numberBean.no == 999
	
	@Value("#{numberBean.no == 999 and numberBean.no < 900}") //false
	private boolean testAnd;
	
	@Value("#{numberBean.no == 999 or numberBean.no < 900}") //true
	private boolean testOr;
	
	@Value("#{!(numberBean.no == 999)}") //false
	private boolean testNot;

	//Mathematical operators
	
	@Value("#{1 + 1}") //2.0
	private double testAdd;
	
	@Value("#{'1' + '@' + '1'}") //1@1
	private String testAddString;
	
	@Value("#{1 - 1}") //0.0
	private double testSubtraction;

	@Value("#{1 * 1}") //1.0
	private double testMultiplication;
	
	@Value("#{10 / 2}") //5.0
	private double testDivision;
	
	@Value("#{10 % 10}") //0.0
	private double testModulus ;
	
	@Value("#{2 ^ 2}") //4.0
	private double testExponentialPower;

	@Override
	public String toString() {
		return "Customer [testEqual=" + testEqual + ", testNotEqual="
				+ testNotEqual + ", testLessThan=" + testLessThan
				+ ", testLessThanOrEqual=" + testLessThanOrEqual
				+ ", testGreaterThan=" + testGreaterThan
				+ ", testGreaterThanOrEqual=" + testGreaterThanOrEqual
				+ ", testAnd=" + testAnd + ", testOr=" + testOr + ", testNot="
				+ testNot + ", testAdd=" + testAdd + ", testAddString="
				+ testAddString + ", testSubtraction=" + testSubtraction
				+ ", testMultiplication=" + testMultiplication
				+ ", testDivision=" + testDivision + ", testModulus="
				+ testModulus + ", testExponentialPower="
				+ testExponentialPower + "]";
	}

	public boolean isTestEqual() {
		return testEqual;
	}

	public void setTestEqual(boolean testEqual) {
		this.testEqual = testEqual;
	}

	public boolean isTestNotEqual() {
		return testNotEqual;
	}

	public void setTestNotEqual(boolean testNotEqual) {
		this.testNotEqual = testNotEqual;
	}

	public boolean isTestLessThan() {
		return testLessThan;
	}

	public void setTestLessThan(boolean testLessThan) {
		this.testLessThan = testLessThan;
	}

	public boolean isTestLessThanOrEqual() {
		return testLessThanOrEqual;
	}

	public void setTestLessThanOrEqual(boolean testLessThanOrEqual) {
		this.testLessThanOrEqual = testLessThanOrEqual;
	}

	public boolean isTestGreaterThan() {
		return testGreaterThan;
	}

	public void setTestGreaterThan(boolean testGreaterThan) {
		this.testGreaterThan = testGreaterThan;
	}

	public boolean isTestGreaterThanOrEqual() {
		return testGreaterThanOrEqual;
	}

	public void setTestGreaterThanOrEqual(boolean testGreaterThanOrEqual) {
		this.testGreaterThanOrEqual = testGreaterThanOrEqual;
	}

	public boolean isTestAnd() {
		return testAnd;
	}

	public void setTestAnd(boolean testAnd) {
		this.testAnd = testAnd;
	}

	public boolean isTestOr() {
		return testOr;
	}

	public void setTestOr(boolean testOr) {
		this.testOr = testOr;
	}

	public boolean isTestNot() {
		return testNot;
	}

	public void setTestNot(boolean testNot) {
		this.testNot = testNot;
	}

	public double getTestAdd() {
		return testAdd;
	}

	public void setTestAdd(double testAdd) {
		this.testAdd = testAdd;
	}

	public String getTestAddString() {
		return testAddString;
	}

	public void setTestAddString(String testAddString) {
		this.testAddString = testAddString;
	}

	public double getTestSubtraction() {
		return testSubtraction;
	}

	public void setTestSubtraction(double testSubtraction) {
		this.testSubtraction = testSubtraction;
	}

	public double getTestMultiplication() {
		return testMultiplication;
	}

	public void setTestMultiplication(double testMultiplication) {
		this.testMultiplication = testMultiplication;
	}

	public double getTestDivision() {
		return testDivision;
	}

	public void setTestDivision(double testDivision) {
		this.testDivision = testDivision;
	}

	public double getTestModulus() {
		return testModulus;
	}

	public void setTestModulus(double testModulus) {
		this.testModulus = testModulus;
	}

	public double getTestExponentialPower() {
		return testExponentialPower;
	}

	public void setTestExponentialPower(double testExponentialPower) {
		this.testExponentialPower = testExponentialPower;
	}
	
	
}
