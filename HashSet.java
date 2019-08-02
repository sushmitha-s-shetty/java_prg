import java.util.TreeSet;

import day4.Freelancer2;

public class HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Character> set1=new HashSet<Character>();
		set1.add('r');
		set1.add('s');
		set1.add('m');
		set1.add('q');
		System.out.println(set1);
		TreeSet<Character> set2=new TreeSet<Character>();
		set2.addAll(set1);
		
		System.out.println(set2);
		System.out.println(set2.contains('R'));
		TreeSet<Freelancer2> obj=new TreeSet<Freelancer2>();
		
		obj.add(new Freelancer2("sush","Python",7,7000));
		obj.add(new Freelancer2("swee","java",7,8000));
		obj.add(new Freelancer2("anu","c",7,7000));
		System.out.println(obj);
		
		}

}
