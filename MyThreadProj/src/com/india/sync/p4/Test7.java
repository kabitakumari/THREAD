package com.india.sync.p4;

public class Test7 {
	public static void main(String args[]) {
		Account ac1 = new Account();
		WithdrawThread mth1 = new WithdrawThread(ac1);
		UpdateAddThread mth2 = new UpdateAddThread(ac1);
		mth1.start();
		mth2.start();
	}
}

class WithdrawThread extends Thread {
	Account ac = null;

	WithdrawThread(Account ac) {
		this.ac = ac;
	}

	public void run() {
		ac.withdraw();
	}
}

class UpdateAddThread extends Thread {
	Account ac = null;
	UpdateAddThread(Account ac) {
		this.ac = ac;
	}
	public void run() {
		ac.updateAddress();
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