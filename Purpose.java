package day4;
import java.util.*;

//run time
public class Purpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String yet="123456987";
		try
		{
			System.out.println(yet.charAt(new Random().nextInt()));
			System.out.println("Random generated");
		}
		catch(StringIndexOutOfBoundsException obj)
		{
			System.out.println(obj+"\range shoulbe withoin"+yet.length());
			System.out.println(yet.charAt(new Random().nextInt(yet.length())));
			System.out.println("Random generated");
			
			
		}
		finally{
			System.out.println("work done");
		}
	}

}
