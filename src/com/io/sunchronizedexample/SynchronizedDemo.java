package com.io.sunchronizedexample;

public class SynchronizedDemo {

	public static void main(String[] args) {
		Display d1=new Display();
		Display d2=new Display();
		Mythread1 t1=new Mythread1(d1);
		Mythread2 t2=new Mythread2(d2);
		t1.start();
		t2.start();
	}

}
