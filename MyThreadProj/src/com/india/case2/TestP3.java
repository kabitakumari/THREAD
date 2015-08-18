package com.india.case2;

public class TestP3 {
	public static void main(String[] args) {
		My1Threadp3 mth1 = new  My1Threadp3();
		My2Threadp3 mth2 = new  My2Threadp3();
		mth1.start();
		mth2.start();
	}
	
}
class My1Threadp3 extends Thread{
	public void run(){
		AccountP3  acc1 = new AccountP3();
		acc1.withdraw();
	}
	
}

class My2Threadp3 extends Thread{
	public void run(){
		AccountP3  acc2 = new AccountP3();
		acc2.withdraw();
	}
	
}
class AccountP3 {
	public synchronized void withdraw(){
		Thread th = Thread.currentThread();
		for(int i=1;i<10;i++){
			System.out.println("Withdraw : "+i+"\t"+th.getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public void update(){
		Thread th = Thread.currentThread();
		for(int i=1;i<10;i++){
			System.out.println("Update : "+i+"\t"+th.getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
