
public class BlackBox extends LoadRunner{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*BlackBox black=new BlackBox();
black.test();
black.testcases();*/
Selenium sell=new Selenium();
sell.testcases();
LoadRunner load= new BlackBox();
load.testcases();
load=new Selenium();
load.testcases();
	}
public void testcases() {
	System.out.println("genearate automatically");
}
}
 class Selenium extends LoadRunner{
	public void testcases() {
		System.out.println("selenium auto");
	}
}

	


abstract  class LoadRunner
{
public void test()
{
	System.out.println("capacity");
}
	abstract public void testcases();
}