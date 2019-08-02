package day4;

import java.io.IOException;
import java.util.*;

public class Compile {

	public static void main(String[] args) throws IOException,InterruptedException{
		// TODO Auto-generated method stub
		Runtime run=Runtime.getRuntime();
		Process pro=run.exec("mspaint");
		Thread.sleep(4000);
		pro=run.exec("vlc");
		
	}

}
