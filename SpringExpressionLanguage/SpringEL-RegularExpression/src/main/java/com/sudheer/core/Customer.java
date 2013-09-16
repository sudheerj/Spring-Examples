package com.sudheer.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customerBean")
public class Customer {

	// email regular expression
	String emailRegEx = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)" +
			"*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	// if this is a digit?
	@Value("#{'100' matches '\\d+' }")
	private boolean validDigit;

	// if this is a digit?
	@Value("#{ ('100' matches '\\d+') == true ? " +
			"'yes this is digit' : 'No this is not a digit'  }")
	private String msg;

	// if this is a valid email address?
	@Value("#{emailBean.emailAddress matches customerBean.emailRegEx}")
	private boolean validEmail;

	public boolean isValidDigit() {
		return validDigit;
	}

	public void setValidDigit(boolean validDigit) {
		this.validDigit = validDigit;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public boolean isValidEmail() {
		return validEmail;
	}

	public void setValidEmail(boolean validEmail) {
		this.validEmail = validEmail;
	}

	public String getEmailRegEx() {
		return emailRegEx;
	}

	public void setEmailRegEx(String emailRegEx) {
		this.emailRegEx = emailRegEx;
	}

	@Override
	public String toString() {
		return "Customer [validDigit=" + validDigit + ", msg=" + msg
				+ ", validEmail=" + validEmail + "]";
	}

}