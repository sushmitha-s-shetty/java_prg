import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> html_files=new ArrayList<String>();
		Vector<String> java_files=new Vector<String>();
		html_files.add("hello");
		html_files.add("mite");
		html_files.add("swee");
		html_files.add("udupi");
		java_files.add("movie");
		java_files.add("mangalore");
		//System.out.println(java_files.contains("anusha"));
		//html_files.retainAll(java_files);
		Collections.replaceAll(html_files,"movie","hello");
		Collections.sort(java_files);
		System.out.println(html_files);
		System.out.println(java_files);
	}

}
