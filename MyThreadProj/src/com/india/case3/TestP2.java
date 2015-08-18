package com.india.case3;

public class TestP2 {
	public static void main(String[] args) {
		Accountp2  acc = new Accountp2();
		MyThreadP2 mth1 = new MyThreadP2(acc);
		MyThreadP2 mth2 = new MyThreadP2(acc);
	mth1.start();
	mth2.start();
	
	
	
	}
}
class MyThreadP2 extends Thread{
	Accountp2  acc = null;
	MyThreadP2(Accountp2  acc ){
		this.acc=acc;
	}
	public void run(){
	acc.update();
	acc.withdraw();
	}
}
class Accountp2{
	public synchronized void withdraw(){
		Thread th = Thread.currentThread();
		for(int i=1;i<=10;i++){
			System.out.println("Withdarw : "+i+"\t"+th.getName());
			try {
				th.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
	}
	public  synchronized void update(){
		Thread th = Thread.currentThread();
		for(int i=1;i<=10;i++){
			System.out.println("Withdarw : "+i+"\t"+th.getName());
			try {
				th.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
	}
}