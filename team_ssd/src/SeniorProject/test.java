package SeniorProject;

import java.io.*;
import java.util.*;

public class test
{
    public static void main(String[] args)
    {
	System.out.println(test123());
    }
    public static String test123()
    {
	String r = "";

	try{
	    //System.setSecurityManager(null);

	    //String[] callArgs = {"mkdir", "/home/alexis/test123"};
            String[] callArgs = {"ls"};
	    ProcessBuilder pb = new ProcessBuilder(callArgs);
	    pb.redirectErrorStream(true);
	    Process p = pb.start();
	    p.waitFor();
	    
	    //BufferedReader br = new BufferedReader(new InputStreamReader(p.getErrorStream() ));
	    BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream() ));
	    String line = "";
	    System.out.println("Start Output");
	    while((line = br.readLine()) != null)
		r += line+"\n";
	    System.out.println("End Output");

	    /*Process p = Runtime.getRuntime().exec(callArgs);
	    p.waitFor();
	    System.out.println("Test Complete");*/
	    r = line;
	}
	catch(IOException e){
	    System.out.println(e);
	    r = "Test failed";
	}
	catch(Exception e){
	}

	return r;
    }
}