package com.india.p4;

public class Lab6 {
	public static void main(String[] args) {
		My2Thread mth1 = new My2Thread();
		My2Thread mth2 = new My2Thread();
		mth1.start();
		mth2.start();
	}

}
class My2Thread extends Thread{
	Hai h = null;
	public void run(Hai h){
		h.withdraw();
	}
}

class Hai{
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
