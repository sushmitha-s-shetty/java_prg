package day4;

//import java.io.IOException;

public class Over extends Seek {
 public void graduate() throws ClassNotFoundException
 {
	 super.graduate();
 }
	
	public static void main(String[] args) throws ClassNotFoundException,ArithmeticException {
		// TODO Auto-generated method stub
		Over sk=new Over();
		sk.greek();
		sk.professional();
		sk.graduate();
	}

}
class Seek
{
	public void greek() throws ClassNotFoundException
	{
		System.out.println("greek doing invention");
	}
	public void professional() throws IndexOutOfBoundsException,NullPointerException
	{
		System.out.println("professionals building product");
	}
	public void graduate() throws ClassNotFoundException
	{
		System.out.println("Simply listen");
	}
}
