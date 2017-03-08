package com.jeevan.samples;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileReaderPractice {


	public static void main(String[] args) 
	{
		String fileName = "C:/Users/Jeevan/Documents/inputforjavapgm.txt";
		
		try{
			FileReader fR = new FileReader(fileName);
		
		BufferedReader bR = new BufferedReader(fR);

		String s = "";
		while ((s = bR.readLine()) != null)
		{
			System.out.println(s);
		}// End of while statement
		}// End of try
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
			
} // End of the main class       
}// End of the parent class
