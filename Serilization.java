package day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serilization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Freelancer2 base=new Freelancer2("sush","java",7,70000);
		File fp=new File("C:/Users/SUSHMITHA/Desktop/sush.txt");
		FileOutputStream fos=new FileOutputStream(fp);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(base);oos.close();
		fos.close();
		System.out.println("object created");
		FileInputStream fis=new FileInputStream(fp);
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Freelancer2 temp=(Freelancer2)ois.readObject();
		ois.close();
		fis.close();
		System.out.println(temp);
		
	}

}
