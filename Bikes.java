import java.util.*;
public class Bikes {
	static Scanner s= new Scanner(System.in);
	static  int ind;
    public static void add(int[] week)
    {
    	int index=0;
    	while(index<week.length)
    	{
    	System.out.println("enter the milage:");
		week[index]=s.nextInt();
		index++;
    	}
    }
    public static void traversal(int[] kitkat)
    {
    	if(ind>=kitkat.length)
    	{
    		return;
    	}
    	else {
    		System.out.println(kitkat[ind]);
    		ind++;
    	}
    	traversal(kitkat);
    }
   /* public static void replace(int[] ele)
    {
    	int ind=0;
    	
    		if(ele[ind]>30 && ele[ind]<50)
    		{
    			ele[ind]=10;
    			System.out.println(ele[ind]);
    			ind++;
    		}
    	
    	replace(ele);
    }*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] milage=new int[10];
		Bikes.ind=0;
		Bikes.add(milage);
		Bikes.traversal(milage);
		//Bikes.replace(milage);
	}

}
