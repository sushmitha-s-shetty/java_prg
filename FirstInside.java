//ststic inner class
public class FirstInside {
String org;
double pack;
static int count;
public String toString()
{
	return org+" "+pack+" "+count+"\n";
}
static class Magno{
	String tech;
	public void detail()
	{
		System.out.println(tech);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				FirstInside first=new FirstInside();
				first.org="infosys";
				first.pack=3.7;
				FirstInside second=new FirstInside();
				second.org="infosys";
				second.pack=3.7;
				System.out.println(first+" "+second);
				FirstInside.Magno mgn=new FirstInside.Magno();
				mgn.tech="Spring";
				mgn.detail();
	}

}
