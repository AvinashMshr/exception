package org.avinash.exeception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Hello world!
 *
 */
public class TryWithResource {
	
	public void reAssigment() {
		try(BufferedReader br = new BufferedReader(new FileReader("input.txt")) ; BufferedReader br1 = new BufferedReader(new FileReader("input.txt")))
		{
			//br = new BufferedReader(new FileReader("output.txt")) ;
		}
		catch(Exception e) {
			
		}
	}
	
	public void onlyTry() {
		FileReader br1= null;
		try {
			br1 = new FileReader("input.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
