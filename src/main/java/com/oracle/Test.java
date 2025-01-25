package com.oracle;

import in.ashokit.security.PwdUtils;

public class Test {
	
	public static void main(String[] args) {
		PwdUtils utils =  new PwdUtils();
		String encodePwd = utils.encodePwd("abc@123");
		System.out.println(encodePwd);
		}
	
}
