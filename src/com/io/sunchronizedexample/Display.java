package com.io.sunchronizedexample;

public class Display {

	/*Static synchronized because there are 2 threads*/
	public static synchronized void displayn()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try
			{Thread.sleep(1000);}
			catch(InterruptedException e){}
		}
	}
	/*Static synchronized because there are 2 threads*/
	public static synchronized void displayc()
	{
		for(int i=65;i<=75;i++)
		{
			System.out.println((char)i);
			try
			{Thread.sleep(1000);}
			catch(InterruptedException e){}
		}
	}

}
