package day4;
import java.util.*;
public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sush employment");
		String name=null;
		int exp[]= {12,4,2,8,5},index=0;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the name");
		name=s.next();
		try
		{


		System.out.println("enter the experince");
		index=s.nextInt();
		System.out.println("selected exp "+exp[index]);

		}
		catch(ArrayIndexOutOfBoundsException arr)
		{
		System.out.println(arr+"\n index should be within "+exp.length);
		index=s.nextInt();
		System.out.println("selected exp"+exp[index]);
		}
		catch(InputMismatchException ins)
		{
			Scanner sc= new Scanner(System.in);
		System.out.println(ins+"\n index should be within "+exp.length);
		index=s.nextInt();
		System.out.println("selected exp"+exp[index]);
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
		finally
		{
		if(exp[index]>=2&&exp[index]<6)
		{
		System.out.println(name+"will get 15lpa");
		}
		else if(exp[index]>=6&&exp[index]<10)
		{
		System.out.println(name+"will get 25lpa");
		}
		else if(exp[index]>=10&&exp[index]<13)
		{
		System.out.println(name+"will get 30lpa");
		}
		}
		}
	}



