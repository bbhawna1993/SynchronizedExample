package com.io.sunchronizedexample;

public class Mythread2 extends Thread{

	Display d;
	Mythread2(Display d)
	{this.d=d;}

	public void run()
	{d.displayc();}
}
