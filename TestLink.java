import java.util.LinkedList;

public class TestLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.addLast("web development");
		list.add(10);
		list.addFirst(100);
		System.out.println(list);
		LinkedList<Double> list2=new LinkedList<Double>();
		list2.addAll(list);
		list2.addFirst(70.0);
		list2.addFirst(90.0);
		System.out.println(list2.indexOf("app devolpment"));
		list2.remove();
		System.out.println(list2);
		System.out.println(list);
		list.add("app development");
		
	}

}
