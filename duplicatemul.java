import java.util.*;

public class duplicatemul {
	static Scanner s=new Scanner(System.in);
	static int dup[]=new int[10];
	   public static void repeat(int[] a,int len)
	   {
		  
		   for(int i=0;i<len;i++)
		   {
			   for(int j=i+1;j<len;j++)
			   {
				   if(a[i]==a[j])
				   {
					   dup[i]=a[i];
					   System.out.println("duplicate array"+dup[i]);
				   }
				   
			   }
			   
		   }
		   int prod=1;
		   for(int i=0;i<dup.length;i++) {
			   prod=prod*dup[i];
			   System.out.println("output--"+prod); 
			  }  
		   
		   }
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the length of array");
		int len=s.nextInt();
		System.out.println("array element");
		int[] a=new int[len] ;
		int ind=0;
		for(int i=0;i<len;i++) {
			a[i]=s.nextInt();
	}
		
		repeat(a,len);
}
}