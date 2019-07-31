
public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Integer alpha=23,cosmo=134;
     System.out.println(cosmo^90);
     System.out.println(cosmo&567);
     System.out.println(cosmo<<3);
     System.out.println(alpha>>3);
     System.out.println(cosmo^alpha);
     cosmo^=alpha;alpha^=cosmo;cosmo^=alpha;
     System.out.println(cosmo+" "+alpha);
     
     
	}

}
