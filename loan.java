
public class loan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//nae company name exper,salary 4-8 pm 2-3 team 
		System.out.println(args.length);
		String name,company_name;
		float salary=0.0F;
		int exp=0;
		name=(args[0]);
		company_name=(args[1]);
		salary=Float.parseFloat(args[2]);
		exp=Integer.parseInt(args[3]);
	  float cs=1*(salary)/3;
	   float ps=1*(salary)/4;
	   System.out.println("credit "+cs);
	   System.out.println("personal laon"+ps);
	   if (exp>=4 && exp<=8)
	   {
		   System.out.println("project manager"); 
	   }
	   else if(exp>=2 && exp<=3)
	   {
		   System.out.println("team leader");
	   }
	   else {
		   System.out.println("same position");
	   }
	}

}
