package com.india.case4;

public class Testp1 {
public static void main(String[] args) {
	Accountp1 acc = new Accountp1() ;
	MyThread mth1= new MyThread(acc);
	MyThread mth2 = new MyThread(acc);
	mth1.start();
	mth2.start();
}
}
class MyThread extends Thread{
	Accountp1 acc = null;
	MyThread(Accountp1 acc ){
		this.acc=acc;
	}
	public void run(){
		acc.withdraw();
		
	}
	
}

	class Accountp1{
	public static synchronized void withdraw(){
		Thread th= Thread.currentThread();
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
