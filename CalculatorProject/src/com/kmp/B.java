package com.kmp;

public class B {
	public static void main(String args[]){
		A a=new A(){
			public void show(){
				System.out.println("Anonymous class");
			}
		};
		a.show();
	}
}
