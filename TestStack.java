import java.util.Iterator;
import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stk=new Stack();
		stk.push(20);
		stk.push('t');
		stk.push("hello");
		System.out.println(stk.search('t'));
		System.out.println(stk.search('k'));
		Stack<String> stk2=new Stack<String>();
		stk2.addAll(stk);
		stk.pop();
		System.out.println(stk2);
		System.out.println(stk.peek());
		Iterator<Object> i=stk.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		stk.clear();
		System.out.println(stk);
		
		
	}

}
