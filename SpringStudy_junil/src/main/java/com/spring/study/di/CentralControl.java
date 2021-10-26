package com.spring.study.di;

/**
 * 
 * 중앙제어 시스템
 *
 */
public class CentralControl {
	private RemoteControl control1;
	private RemoteControl control2;
	
	public CentralControl(RemoteControl control1, RemoteControl control2) {
		this.control1 = control1;
		this.control2 = control2;
	}
	
	public void onAll() {
		control1.on();
		control2.on();
	}
	
	public void offAll() {
		control1.off();
		control2.off();
	}
}
