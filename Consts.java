
public class Consts extends Briliant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consts con=new Consts();
		con.spring();
		con.hibernate();
}

}
class Briliant{
	
	public void spring()
	{
		System.out.println("basic web application");
	}
		final public void hibernate()
		{
			System.out.println("ORM model");
		}
	
final class Android
{
	///final cannot be inherited only within class accessed
		//final class instantiated cannot be extended due to private
	public void  skill()
	{
		System.out.println("java and xml");
	}
}
}