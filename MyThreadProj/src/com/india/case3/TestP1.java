package com.india.case3;

public class TestP1 {
	public static void main(String[] args) {
		AccountP1 acc1 = new AccountP1() ;
		MyThreadp1 mth1 = new MyThreadp1(acc1);
		MyThreadp1 mth2 = new MyThreadp1(acc1);
		mth1.start();
		mth2.start();
	}

}

class MyThreadp1 extends Thread{
	AccountP1 acc = null;
	MyThreadp1(AccountP1 acc){
		this.acc= acc;
		
	}
	public void run(){
		
		acc.withdraw();
		
	}
}

class AccountP1{
	public synchronized void withdraw(){
		Thread th = Thread.currentThread();
		for(int i=1;i<=10;i++){
			System.out.println("Withdraw :" +i+"\t"+th.getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}}
		
	
	public  synchronized void update(){
		Thread th = Thread.currentThread();
		for(int i=1;i<=10;i++){
			System.out.println("Withdraw :" +i+"\t"+th.getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}}
}