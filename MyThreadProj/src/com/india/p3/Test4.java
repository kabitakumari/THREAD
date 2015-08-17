package com.india.p3;

public class Test4{
public static void main(String args[]){
Hello h = new Hello();

ShowThread sth = new ShowThread(h);

DispThread dth = new DispThread(h);
// dth.start();
Thread th2 = new Thread(dth);

sth.start();
th2.start();

}
}

class ShowThread extends Thread{
Hello h = null;
ShowThread(Hello h){
this.h = h;
}
public void run(){
h.show();
}
}

class DispThread implements Runnable{
Hello h = null;
DispThread(Hello h){
this.h = h;
}
public void run(){
h.display();
}
}

class Hello{
synchronized void show(){
Thread th=Thread.currentThread();
for(int i=1;i<=10;i++){
System.out.println("SHOW\t"+i+"\t"+th.getName());
try{
wait(1000);
//Thread.sleep(1000);
}catch(Exception e){
e.printStackTrace();
}
}
}

synchronized void display(){
Thread th=Thread.currentThread();
for(int i=11;i<=20;i++){
System.out.println("DISP\t"+i+"\t"+th.getName());
try{
wait(1000);
//Thread.sleep(1000);
}catch(Exception e){
e.printStackTrace();
}
}
}
}