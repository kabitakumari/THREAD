package com.india.case3;

public class TestP3 {
	public static void main(String[] args) {
		
		My1ThreadP3 mth1 = new My1ThreadP3();
		My2ThreadP3 mth2 = new My2ThreadP3();
	mth1.start();
	mth2.start();
	
	
	
	}
}
class My1ThreadP3 extends Thread{
	public void run(){
		Accountp3 acc1 =new Accountp3();
		acc1.withdraw();
	}
	
}

class My2ThreadP3 extends Thread{
	public void run(){
		Accountp3 acc2 =new Accountp3();
		acc2.withdraw();
	}
	
}
class Accountp3{
	public void withdraw(){
		Thread th = Thread.currentThread();
	for(int i=1;i<10;i++){
		System.out.println("Withdraw : "+i+"\t"+th.getName());
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}}
	
}