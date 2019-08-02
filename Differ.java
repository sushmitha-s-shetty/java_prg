package day4;
import java.util.*;
public class Differ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine m=new Machine();
		Thread t1=new Thread(m,"sush");
		Thread t2=new Thread(m,"ravi");
		Thread t3=new Thread(m,"ram");
		Thread t4=new Thread(m,"uma");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
class Machine extends Thread 
{
	Scanner  s=new Scanner(System.in);
	int avai_amount=10000;
	int cash;
	public void withdraw()
	{
		System.out.println("Enter the amount you want to withdrawal");
		cash=s.nextInt();
		if(avai_amount>=cash)
		{
			avai_amount-=cash;
			System.out.println("Withdrawal successful");
		}
		else {
			System.out.println("NO suffient balance");
		}
	}
	synchronized public void run()
	{
		System.out.println(Thread.currentThread().getName()+" "+
				Thread.currentThread().getId()+" "+Thread.currentThread());
		withdraw();
	}
}