package com.webonise;

import java.util.Enumeration;
import java.util.Vector;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Enumeration<String> days;
		Vector<String> dayNames= new Vector<String>();
		dayNames.add("sunday");
		dayNames.add("monday");
		dayNames.add("tuesday");
		days=dayNames.elements();
		while(days.hasMoreElements())
		{
			System.out.println(days.nextElement());
		}
		
	}

}
