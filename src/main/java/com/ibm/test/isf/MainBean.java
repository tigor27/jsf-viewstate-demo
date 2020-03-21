package com.ibm.test.isf;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "main", eager = true)
public class MainBean {

	public MainBean() {
		System.out.println("HelloWorld started!");
	}

	public String getMessage() {
		return "Hello World!";
	}

}
