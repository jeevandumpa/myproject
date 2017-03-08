package com.jeevan.samples;
import java.io.*;
//import java.util.*;

public class FileReadWrite {

	static String ipFileName = "C:/Users/Jeevan/Documents/inputforjavapgm.txt";
	static String opFileName = "C:/Users/Jeevan/Documents/outputforjavapgm.txt";
	
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		try {
		FileReader  fR1 = new FileReader(ipFileName);
		BufferedReader bR1 = new BufferedReader(fR1);

		FileWriter  fW1 = new FileWriter(opFileName);
		BufferedWriter bW1 = new BufferedWriter(fW1);
		
		String s = "";
		s = bR1.readLine ();
						

			while (s != null){
				bW1.write(s);
				bW1.newLine();
				s= bR1.readLine();
			}//end of while 
		bW1.close();			
		}//end of try
		

        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                ipFileName + "'");                

        }// end of exception
	}// end of main
}// end of class file
