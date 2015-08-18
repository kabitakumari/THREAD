package com.india.p4;

public class Lab7 {
	public static void main(String[] args) {
		Test test1 = new Test();
		MeraThread1 mth1 = new MeraThread1(test1);
		MeraThread1 mth2 = new MeraThread1(test1);
		mth1.start();
		mth2.start();
	}
}

class MeraThread1 extends Thread {
	Test test = null;

	MeraThread1(Test test) {
		this.test = test;
	}

	public void run() {
		test.withdraw();
	}

}

class Test {
	public void withdraw() {
		Thread th = Thread.currentThread();
		for (int i = 0; i < 10; i++) {

			System.out.println("Withdraw()   :  " + i + "\t" + th.getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}

	public void update() {
		Thread th = Thread.currentThread();
		for (int i = 0; i < 10; i++) {
			System.out.println("Update()   :  " + i + "\t" + th.getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}

	}
}
