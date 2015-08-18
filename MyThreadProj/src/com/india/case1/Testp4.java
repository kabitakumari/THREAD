package com.india.case1;

public class Testp4 {
	public static void main(String[] args) {
		My1ThreadP4 mth1 = new My1ThreadP4();
		My2ThreadP4 mth2 = new My2ThreadP4();
	Thread th = new Thread(mth2);
	mth1.start();
	th.start();
	
	
	
	
	}
}



class My1ThreadP4 extends Thread{
	public void run(){
		AccountP4 acc1 = new AccountP4();
		acc1.update();
	}
	
}
class My2ThreadP4 implements Runnable{
	public void run(){
		AccountP4 acc1 = new AccountP4();
		acc1.withdraw();
	}
	
}

class AccountP4 {
	public void withdraw(){
		Thread th =Thread.currentThread(); 
		for(int i=1;i<=10;i++){
			System.out.println("Withdraw : "+i+"\t"+th.getName()+"\t"+th.getPriority());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			e.printStackTrace();
			}
		}
	}
	public void update(){
		Thread th =Thread.currentThread(); 
		for(int i=11;i<=20;i++){
			System.out.println("Update : "+i+"\t"+th.getName()+"\t"+th.getPriority());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			e.printStackTrace();
			}
		}
	}
}
