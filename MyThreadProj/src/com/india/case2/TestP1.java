package com.india.case2;

public class TestP1 {
	public static void main(String[] args) {
		System.out.println("case2:  p1");
		AccountP1 acc1 = new AccountP1(); 
		MyThreadP1 mth1 = new MyThreadP1(acc1);
		MyThreadP1 mth2 = new MyThreadP1(acc1);
		mth1.start();
		mth2.start();
	}

}

class MyThreadP1 extends Thread{
	AccountP1 acc = null;
	MyThreadP1(AccountP1 acc){
		this.acc=acc;
	}
	public void run(){
		acc.withdraw();
	}
}
class AccountP1{
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
	
}
