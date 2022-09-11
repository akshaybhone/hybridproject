package Scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import POMPages.SkillraryDemoLoginPage;
import POMPages.SkillraryLoginPage;
import POMPages.TestingPage;

public class TestCase2 extends BaseClass {
	
	@Test
	public void tc2() throws IOException, InterruptedException {
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
				
		SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
		utilities.switchingtab(driver);
		utilities.dropDown(sd.getcoursedd(),pdata.getpropertydata("coursedd"));
		
		TestingPage tp = new TestingPage(driver);   
		utilities.dragdrop(driver,tp.getSeleniumtraining(),tp.getCarttab());
		Point loc = tp.getFacebook().getLocation();
		int x= loc.getX();
		int y = loc.getY();
		
		utilities.scrollBar(driver, x, y);
		tp.facebookicon();
		  
		
		
		
	}

}
