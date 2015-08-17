package com.india;

public class Test1{
public static void main(String args[]){
Hello h = new Hello();
h.show();
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