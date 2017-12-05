package com.reuters.rnews.rn;

import org.openqa.selenium.NoSuchElementException;

public class Utility {
	
	
	public static boolean bottomMenuElementExist(String whichElement) {
		boolean element;

		 try
		    {
			 Server.driver.findElementById(whichElement);
			 element = true;
		    }
		    catch (NoSuchElementException e)
		    {
		    	element = false;
		}
		return element;
		
	}
	

}
