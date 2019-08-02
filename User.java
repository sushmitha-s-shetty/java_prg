package day4;
import java.util.*;
public class User {
static int index;
static Freelancer2[] base=new Freelancer2[4];
static boolean status=false;
static int pos;
	public static void main(String[] args) {

			// TODO Auto-generated method stub
			//freelancer free1=new freelancer();
			//free1.setName("swee");free1.setExp(2); free1.setSkill("software developer");free1.setId(5);
			//System.out.println(free1);
			base[0]=new Freelancer2("ss","java",7,7000);
			base[1]=new Freelancer2("s","java",12,17000);
			base[2]=new Freelancer2("sj","c",2,5000);
			base[3]=new Freelancer2("ls","python",5,8000);
			filter("datastructure");
	}
	
public static void filter(String some)
{
	for(Freelancer2 free:base)
	{
		if(free.getSkill().equals(some))
		{
			System.out.println(free);
			status=true;
		}
		else {
			status=false;
		}
	}
	if(status) {
		return;
	}
	else
	{
		try {
			throw new SushException(some);
		}
		catch(SushException se)
		{
			System.out.println(se);
			System.out.println("enter another skill");
			filter(new Scanner(System.in).next());
			
		}
	}
}
}
