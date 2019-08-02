package day4;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;


public class FileWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Freelancer2 base=new Freelancer2("sush","java",7,70000);
		File fp=new File("C:/Users/SUSHMITHA/Desktop/sush.txt");
		FileOutputStream fos=new FileOutputStream(fp);
		DeflaterOutputStream dos=new DeflaterOutputStream(fos);
		dos.write(base.toString().getBytes());
		dos.close();
		fos.close();
		System.out.println("file created and data writting");
		//file reading
		FileInputStream fis=new FileInputStream(fp);
		InflaterInputStream iis=new InflaterInputStream(fis);
		byte[] temp=new byte[fis.available()];
		iis.read(temp);
		iis.close();
		fis.close();
		System.out.println(new String(temp));
		
	}

}
