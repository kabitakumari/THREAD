package com.india.case2;

public class TestP2 {
	public static void main(String[] args) {
		AccountP2 acc1 = new AccountP2(); 
		MyThreadP2 mth1 = new MyThreadP2(acc1);
		MyThreadP2 mth2 = new MyThreadP2(acc1);
		mth1.start();
		mth2.start();
	}

}

class MyThreadP2 extends Thread{
	AccountP2 acc = null;
	MyThreadP2(AccountP2 acc){
		this.acc=acc;
	}
	public void run(){
		acc.withdraw();
		acc.update();
	}
}
class AccountP2{
	public synchronized void withdraw(){
		Thread th = Thread.currentThread();
		for(int i=1;i<10;i++){
			System.out.println("withdraw : "+i+"\t"+th.getId()+"\t"+th.getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	public  void update(){
		Thread th = Thread.currentThread();
		for(int i=11;i<20;i++){
			System.out.println("update : "+i+"\t"+th.getId()+"\t"+th.getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}
