import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;
import java.util.TreeMap;

public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String,Integer>  can=new Hashtable<String,Integer>();
		can.put("sush", 4);
		can.put("swee", 0);
		can.put("pooja", 1);
		can.put("anu", 3);
		can.put("prathi", 2);
		System.out.println(can);
		TreeMap<String,Integer> pro=new TreeMap<String,Integer>();
		pro.putAll(can);
		System.out.print(pro);
		pro.remove("sush");System.out.println(pro.containsValue(3));
		Set<String> names=pro.keySet();
		System.out.println(names);
		Collection<Integer> count=can.values();
		System.out.println(count);
	}

}
