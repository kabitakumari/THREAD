package com.india.case4;

public class Testp4 {
public static void main(String[] args) {
	
	My1ThreadP4 mth1= new My1ThreadP4();
	My2ThreadP4 mth2 = new My2ThreadP4();
	mth1.start();
	mth2.start();
}
}
class My1ThreadP4 extends Thread{
	
public void run(){
		Accountp4 acc1 = new Accountp4();
		acc1.withdraw();
		
		
	}
	
}
class My2ThreadP4 extends Thread{
	
public void run(){
		Accountp4 acc2 = new Accountp4();
		acc2.update();
		
		
	}
	
}

	class Accountp4{
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
