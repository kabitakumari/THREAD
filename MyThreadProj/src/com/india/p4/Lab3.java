package com.india.p4;


public class Lab3 {
	public static void main(String[] args) {
		WithdrawnThread wth1 = new WithdrawnThread();
		wth1.start();
		
	}
}

class Acount {
	public void withdraw_Card() {
		for(int i=100;i<=110;i++){
			
		System.out.println("Amount is withdrawn by Card : "+i);
	}
		}
	public  void withdraw_Cheque() {
		for(int i=200;i<=210;i++){
		System.out.println("Amount is withdrawn by Cheque  : "+i);
	}
		}
	
}

class WithdrawnThread extends Thread {
	public void run() {
Acount acc = new Acount();
acc.withdraw_Card();
try{
	Thread.sleep(1000);
	}catch(Exception e){
		e.printStackTrace();
	}
acc.withdraw_Cheque();
	}
}

