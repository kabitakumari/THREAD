package com.india.case1;

public class Testp2 {
	public static void main(String[] args) {
		Accountp2 acc1 = new Accountp2();
		MyThreadP2 mth1 = new MyThreadP2(acc1);
		MyThreadP2 mth2 = new MyThreadP2(acc1);
		Thread th1 = new Thread(mth1);
		
		Thread th2 = new Thread(mth2);
		th2.start();
		th1.start();
	}

}
class MyThreadP2 implements Runnable{
	Accountp2 acc = null;
	MyThreadP2(Accountp2 acc){
		this.acc = acc;
	}
	public void run(){
		acc.update();
		acc.withdraw();
		
	}
}
class Accountp2{
	public void withdraw(){
		Thread th = Thread.currentThread();
		 for(int i=1;i<=10;i++){
			  System.out.println("Withdraw() :  "+i+"\t"+th.getName());
			  try {
					 Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				 
		 }
	}
	public void update(){
		Thread th = Thread.currentThread();
		 for(int i=11;i<=20;i++){
			 System.out.println("Update() :  "+i+"\t"+th.getName());
			 try {
				 Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			 
			 
		 }
	}
}
