package test;

import org.testng.annotations.Test;

import base.Vistarabase;
import page.Vistaralogin;
import utility.Excelhandlevistara;

public class Vistaralogintest extends Vistarabase {
	
		
		@Test
		public void logincredentials() 
		{
			
		
	    Vistaralogin ob=new Vistaralogin(driver);
		
		String excel="C:\\Users\\DELL\\Desktop\\Book1.xlsx";
		String sheet="Sheet1";
		int rowcount=Excelhandlevistara.getrowcount(excel, sheet);
		System.out.println("rowcount = "+rowcount);
		
		for (int i=1;i<=rowcount;i++)
		{
			String email=Excelhandlevistara.getcellvalue(excel, sheet, i, 0);
			System.out.println("email = "+email);
			String password=Excelhandlevistara.getcellvalue(excel,sheet,i,1);
			System.out.println("password = "+password);
			
			ob.setvalues(email, password);
			ob.login();
			
			String expected="https://www.airvistara.com/in/en/club-vistara/my-account";
			String actual=driver.getCurrentUrl();
			
			if (actual.equals(expected))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			} 
			//Thread.sleep(3000);
			//driver.navigate().refresh();
			//Thread.sleep(3000);
			ob.clear();
	}	

	}

}
