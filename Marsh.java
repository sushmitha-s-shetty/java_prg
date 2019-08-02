package day4;
//compile time throws

public class Marsh  implements Cloneable{
 String bike;
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Marsh m1=new Marsh();
		m1.bike="Apache200";
		Marsh m2=new Marsh();
		m2.bike="Avenger220";
		System.out.println(m1.bike+" "+m2.bike);
		Marsh m3=new Marsh();
		m3=m2;
		System.out.println(m1.bike+" "+m2.bike+" "+m3.bike);
		Marsh m4= (Marsh)m1.clone();
		System.out.println(m1.bike+" "+m4.bike);
		m1.bike="mahindra";
		System.out.println(m1.bike+" "+m2.bike+" "+m4.bike);
		
		
	}

}
