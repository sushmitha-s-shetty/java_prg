mport java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import day4.Freelancer2;


public class ToXML {
public static void main(String[] args) throws JAXBException, IOException {
      Freelancer2[] base=new Freelancer2[3];
      base[0]=new Freelancer2("Anusha","Python",3,70000);
      base[1]=new Freelancer2("Sush","C",2,70000);
      base[2]=new Freelancer2("Shru","Embeded Systems",1,70000);
      JAXBContext con=JAXBContext.newInstance(Freelancer2.class);
      Marshaller marsh=con.createMarshaller();
      marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
      FileOutputStream fos=new FileOutputStream("C:/Users/SUSHMITHA/Desktop/sush.xml");
      for(Freelancer2 f:base){marsh.marshal(f, fos);}fos.close() ;  
      System.out.println("XML Created");

}
}