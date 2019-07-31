import java.util.*;
public class Bus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub700,500,800,450
		Scanner s=new Scanner(System.in);
		//System.out.println("enter the");
		int money=0,passenger=0,total=0;
		int bus=1;
		while(bus<=4) {
			System.out.println("Set the fare amount for bus"+bus);
			int busfare=s.nextInt();
			int seat=1;
			while(seat<=7)
			{ 
				System.out.println("enter the  amount for bus");
				int amount=s.nextInt();
				if(passenger>=busfare)
				{
				money=money+busfare;
				System.out.println("seat booked");
			    }
				else {
					System.out.println("insufficient amount");
				}
			seat++;
			}
		System.out.println("the number of seat booked in bus1 is: "+seat);
		System.out.println("collection from bus: "+money);
			total+=money;
			bus++;
			}
		System.out.println("the totalmoney"+total);
	}
			
		
}
		



