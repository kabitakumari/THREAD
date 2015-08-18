package com.india.p4;

public class Lab5 {
	public static void main(String[] args) {
		MyThread mth1 = new MyThread();
		MyThread mth2 = new MyThread();
		mth1.start();
		mth2.start();
	}

}
class MyThread extends Thread{
	Hel h = null;
	public void run(Hel h){
		h.withdraw();
	}
}

class Hel{
	public void withdraw(){
		Thread th = Thread.currentThread();
		System.out.println(th);
		for(int i =1;i<=10;i++){
			System.out.println("Withdraw :"+th.getName()+i);
			try{
			Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		}
		
		public void update(){
			Thread th = Thread.currentThread();
			System.out.println(th);
			for(int i =1;i<=10;i++){
				System.out.println("Withdraw :"+th.getName()+i);
				try{
					Thread.sleep(1000);
					}catch(Exception e){
						e.printStackTrace();
					}
				
			}
	}
}
