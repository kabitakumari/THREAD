package com.india.sync.p3;

public class Test7 {
	public static void main(String args[]) {
		Account ac1 = new Account();
		Account ac2 = new Account();
		MyThread mth1 = new MyThread(ac1);
		MyThread mth2 = new MyThread(ac2);
		mth1.start();
		mth2.start();
	}
}

class MyThread extends Thread {
	Account ac = null;

	MyThread(Account ac) {
		this.ac = ac;
	}

	public void run() {
		ac.withdraw();
	}
}

class Account {
	synchronized void withdraw() {
		Thread th = Thread.currentThread();
		for (int i = 1; i <= 10; i++) {
			System.out.println("WITHDRAW\t" + i + "\t" + th.getName() + "\t"
					+ this);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	void updateAddress() {
		Thread th = Thread.currentThread();
		for (int i = 1; i <= 10; i++) {
			System.out.println("UP-ADD\t" + i + "\t" + th.getName() + "\t"
					+ this);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}