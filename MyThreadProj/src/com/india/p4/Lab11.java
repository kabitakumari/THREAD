package com.india.p4;

public class Lab11 {
	public static void main(String[] args) {
		A a = new A();
B b = new B();
a.start();
Thread th = new Thread(b);
th.start();
	}
}

class A extends Thread{
	public void run(){}
} 
class B implements Runnable{

	
	public void run() {
	
		
	}
	
	
} 