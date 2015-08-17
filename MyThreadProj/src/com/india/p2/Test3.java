package com.india.p2;

public class Test3{
public static void main(String args[]){

ShowThread sth = new ShowThread();

DispThread dth = new DispThread();
// dth.start();
Thread th2 = new Thread(dth);

sth.start();
th2.start();

}
}

class ShowThread extends Thread{
public void run(){
Hello h = new Hello();
h.show();
}
}

class DispThread implements Runnable{
public void run(){
Hello h = new Hello();
h.display();
}
}

class Hello{
void show(){
Thread th=Thread.currentThread();
for(int i=1;i<=10;i++){
System.out.println("SHOW\t"+i+"\t"+th.getName());
try{
Thread.sleep(1000);
}catch(Exception e){
e.printStackTrace();
}
}
}
void display(){
Thread th=Thread.currentThread();
for(int i=11;i<=20;i++){
System.out.println("DISP\t"+i+"\t"+th.getName());
try{
Thread.sleep(1000);
}catch(Exception e){
e.printStackTrace();
}
}
}
}