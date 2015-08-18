package com.india.case1;

public class Testp1 {
	public static void main(String[] args) {
		System.out.println("case1:  p1");
		Hellop1 h1 = new  Hellop1();
		MyThreadP1 mth1 = new MyThreadP1(h1);
		MyThreadP1 mth2 = new MyThreadP1(h1);
		mth1.start();
		mth2.start();
	}

}
class MyThreadP1 extends Thread{
	Hellop1 h = null;
	MyThreadP1(Hellop1 h){
		this.h = h;
	}
	public void run(){
		h.withdraw();
		
		}
	
}

class Hellop1{
	public void withdraw(){
		Thread th =Thread.currentThread();
		for(int i=1;i<=10;i++){
			System.out.println("Withdraw :  "+i+"\t"+th.getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
