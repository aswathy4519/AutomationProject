package test;

import org.testng.annotations.Test;

import base.Vistarabase;
import page.Vistaraflightbook;

public class Vistaraflightbooktest extends Vistarabase{
	@Test
	public void flightbook() throws InterruptedException
	{
		Vistaraflightbook ob=new Vistaraflightbook(driver);
		Thread.sleep(3000);
		ob.login("aswathy.sabu.4519@gmail.com", "As@914252");
		ob.loginbutton();
		Thread.sleep(3000);
		ob.mousehover();
		ob.flight();
		ob.oneway();
		ob.departureplace();
		ob.arrrivalplace();
		ob.departcalendar();
		ob.monthclick();
		ob.calendar();
		ob.searchflight();
		ob.flightselect();
		ob.continue1();
		ob.continue2();
		ob.seats();
		ob.seatselect();
		ob.confirm();
		ob.continue3();
		
	}

}
