package day4;

public class Buffet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veg v=new Veg();
		Nonveg non=new Nonveg();
		Thread t1=new Thread(non,"sush");
		Thread t2=new Thread(v,"swee");
		Thread t3=new Thread(v,"ramya");
		Thread t4=new Thread(non,"pooja");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
class Veg implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" "+"had veg biriyani");
		System.out.println(Thread.currentThread().getName()+" "+"had curd rice");
if(Thread.currentThread().getName().equals("swee"))
{
	Thread.currentThread().stop();
}
System.out.println(Thread.currentThread().getName()+"had desert");
	}
}

class Nonveg implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"had mutton biriyani");
		if(Thread.currentThread().getName().equals("ramya"))
		{
			try {
				System.out.println(Thread.currentThread().getName()+"gonna wait");
				Thread.sleep(1000);
			}catch(InterruptedException e){}
		   	
		   }
		   System.out.println(Thread.currentThread().getName()+"had desert");
		   
		}

		}
