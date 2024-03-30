package test;

import org.testng.annotations.Test;

import base.Vistarabase;
import page.Vistaraoffers;



public class Vistaraofferstest extends Vistarabase {
	@Test
	public void offers() throws InterruptedException 
	{
		
	  Vistaraoffers ob= new Vistaraoffers(driver);
	  
	  ob.login("aswathy.sabu.4519@gmail.com", "As@914252");
	  ob.loginbutton();
	  ob.clubvistarahover();
	  ob.currentoffers();
	  ob.viewalloffers();
	  ob.scroll();
	

}

}
