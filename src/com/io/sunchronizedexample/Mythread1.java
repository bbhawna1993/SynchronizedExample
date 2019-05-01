package com.io.sunchronizedexample;

public class Mythread1 extends Thread{

	Display d;
	Mythread1(Display d)
	{this.d=d;}

	public void run()
	{
		d.displayn();
	}
}
