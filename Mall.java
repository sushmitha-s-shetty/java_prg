package day4;

import java.util.Scanner;

public class Mall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Games game=new Games();
		Shopping shop=new Shopping(game);
		Thread t1=new Thread(game,"sush");
		Thread t2=new Thread(shop,"swee");
		t1.start();
		t2.start();
	}

}
class Shopping implements Runnable
{
	Games g;
	Shopping(Games temp)
	{
		g=temp;
	}
	public void run()
	{
		synchronized(g.s)
		{
			if(g.amount<500)
			{
				g.amount=1000;
				System.out.print(Thread.currentThread().getName()+"going to notify");
				g.s.notify();
			}
	
	}
		System.out.println(Thread.currentThread().getName()+" "+"shopping in Levis and LeeCooper");
	}
}

class Games implements Runnable{
	Scanner  s=new Scanner(System.in);
	int amount;
	public void run()
	{
		synchronized (s) {
		System.out.println("enter the price for entry");
		amount=s.nextInt();
		if(amount<=500)
		{
			try {
				
				s.wait();			
				}catch(InterruptedException e)
		{
		e.printStackTrace();
		}
		}
		System.out.println(Thread.currentThread().getName()+"you can enjoy play station");
	}
		
	}
}