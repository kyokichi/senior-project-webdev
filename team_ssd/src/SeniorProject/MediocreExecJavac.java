package SeniorProject;

import java.util.*;
import java.io.*;
public class MediocreExecJavac
{
    public static String exec()
    {
	String output = "";

        try
	    {            
		Runtime rt = Runtime.getRuntime();
		Process proc = rt.exec("ls");
		InputStream stderr = proc.getInputStream();
		InputStreamReader isr = new InputStreamReader(stderr);
		BufferedReader br = new BufferedReader(isr);
		String line = null;

		System.out.println("<OUTPUT>");
		while ( (line = br.readLine()) != null)
	        {
		    output += line+"\n";
		    System.out.println(line);
		}
		System.out.println("</OUTPUT>");
		int exitVal = proc.waitFor();
		System.out.println("Process exitValue: " + exitVal);
	    } catch (Throwable t)
	    {
		t.printStackTrace();
	    }

	return output;
    }
}