package com.india.p4;

public class Lab1 {
	public static void main(String[] args) {
		MyThread1 myth1 = new MyThread1();
		MyThread2 myth2 = new MyThread2();
		myth1.start();
		myth2.start();
	}

}

class MyThread1 extends Thread {
	public void run() {
		Hello h = new Hello();
		h.show();
	}
}

class MyThread2 extends Thread {
	public void run() {
		Hello h = new Hello();
		h.display();
	}
}

class Hello {

	public void show() {
		for (int i = 1; i <= 10; i++) {
			Thread th = new Thread();
			System.out.println("Show() "+"\t" + i +"\t"+ th.getName());
		}
	}

	public void display() {
		for (int i = 11; i <= 20; i++) {
			Thread th = new Thread();
			System.out.println("display()"+"\t" + i+"\t"
					+ ""+ th.getName());
		}
	}

}