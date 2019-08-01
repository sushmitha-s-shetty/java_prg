

public class SecondInside {
 String product;
 float monitorSize;
 class Enquiry
 {
	 int price;
	 public void show()
	 {
		 System.out.println(product+" "+monitorSize+" "+price);
	 }
		 public void greetings()
		 {
			 System.out.println(product+" are going to dispaly"); 
		 }
	 }
 
 
	
	
	
	
	
	public static void main(String[] args) {
		SecondInside s=new SecondInside();
		//SecondInside.Enquiry en= new SecondInside.Enquiry();
		s.monitorSize=32.7F;
		s.product="Sony";
		Enquiry enq= s.new Enquiry();
		enq.price=27000;
		enq.greetings();
		enq.show();
	}

}
