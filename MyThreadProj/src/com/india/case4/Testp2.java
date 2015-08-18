package com.india.case4;

public class Testp2 {
public static void main(String[] args) {
	Accountp2 acc = new Accountp2() ;
	MyThreadP2 mth1= new MyThreadP2(acc);
	MyThreadP2 mth2 = new MyThreadP2(acc);
	mth1.start();
	mth2.start();
}
}
class MyThreadP2 extends Thread{
	Accountp2 acc = null;
	MyThreadP2(Accountp2 acc ){
		this.acc=acc;
	}
	public void run(){
		acc.withdraw();
		acc.update();
		
	}
	
}

	class Accountp2{
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
	
	public  synchronized void update(){
		Thread th= Thread.currentThread();
		for(int i=1;1<10;i++){
			System.out.println("Update : "+i+"\t"+th.getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
