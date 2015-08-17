package com.india.p4;

class Account{
	int bal=900;
	public void withdraw(int amt){
		if(amt>bal){
			System.out.println(Thread.currentThread().getName()+"going to Withdraw...."+bal);
			try {
				Thread.sleep(1200);
			} catch (Exception e) {
			bal-=amt;
			System.out.println(Thread.currentThread().getName()+"going to Withdraw...."+bal);
			}
			
		}else{
			System.out.println("No Funds for"+Thread.currentThread().getName());
		}
	}
	public int getBal(){
		return bal;
	}
}
class AccountThread implements Runnable{
Account acc = null;
AccountThread(Account acc){
	this.acc = acc;
	Thread t1 = new Thread(this,"A");
	Thread t2 = new Thread(this,"A");
	t1.start();
	t2.start();
	
}
	
	public void run() {
		for(int i=0;i<5;i++){
			acc.withdraw(225);
			if(acc.getBal()<0){
				System.out.println("Amount is Withdrawn");
			}                   }            }              }

public class Lab2 {
	public static void main(String[] args) {
Account acc = new Account();
new AccountThread(acc);
	
	}
}