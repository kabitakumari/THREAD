package com.india.case2;

public class TestP4 {
	public static void main(String[] args) {
		My1Threadp4 mth1 = new  My1Threadp4();
		My2Threadp4 mth2 = new  My2Threadp4();
		mth1.start();
		mth2.start();
	}
	
}
class My1Threadp4 extends Thread{
	public void run(){
		AccountP4  acc1 = new AccountP4();
		acc1.withdraw();
	}
	
}

class My2Threadp4 extends Thread{
	public void run(){
		AccountP4  acc2 = new AccountP4();
		acc2.update();
	}
	
}
class AccountP4 {
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
