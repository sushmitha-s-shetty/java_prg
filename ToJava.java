import java.io.File;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;

import day4.Freelancer2;

public class ToJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File fos=new File("C:/Users/SUSHMITHA/Desktop/sush.xml");
		JAXBContext con=JAXBContext.newInstance(Freelancer2.class);
	    Unmarshaller unmarsh=con.createUnmarshaller();
	    Freelancer2 temp=(Freelancer2)unmarsh.unmarshal(fos);
	    System.out.println(temp);
	}

}
