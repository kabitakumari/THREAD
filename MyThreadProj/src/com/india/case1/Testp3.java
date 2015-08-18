package com.india.case1;

public class Testp3 {
	public static void main(String[] args) {
		My1ThreadP3 mth1 = new My1ThreadP3();
		My2ThreadP3 mth2 = new My2ThreadP3();
		Thread th1 = new Thread(mth1);
		Thread th2 = new Thread(mth2);
		th1.start();
		th2.start();
	}
}
class My1ThreadP3 implements Runnable{
	public void run(){
		AccountP3 acc1 = new AccountP3();
		acc1.withdraw();
	}
}

class My2ThreadP3 implements Runnable{
	public void run(){
		AccountP3 acc2 = new AccountP3();
		acc2.withdraw();
	}
}
class AccountP3{
	public void withdraw(){
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
}
