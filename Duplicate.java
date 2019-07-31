import java.util.*;

public class Duplicate {
   static Scanner s=new Scanner(System.in);
   static int dup;
   public static void repeat(int[] a,int len,int num)
   {
	  
	   for(int i=0;i<len;i++)
	   {
		   for(int j=i+1;j<len;j++)
		   {
			   if(a[i]==a[j])
			   {
				   dup=a[i];
				   
			   }
			  
		   }
		   
	   }
	   if(dup%num==0)
		  {
			  System.out.println("output--"+dup); 
		  }  
	  
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the length of array");
		int len=s.nextInt();
		System.out.println("array element");
		int[] a=new int[len] ;
		//System.out.println(a);
		int ind=0;
		for(int i=0;i<len;i++) {
			a[i]=s.nextInt();
			
		}
		System.out.println("enter the NUM");
		int num=s.nextInt();
		repeat(a,len,num);
		

}
}
