package Scripts;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import POMPages.AddtoCartPage;
import POMPages.SkillraryDemoLoginPage;
import POMPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass {
	@Test
	public void tc1() {
		SkillraryLoginPage s = new  SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		utilities.switchingtab(driver);
		
		SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
		utilities.mouseHover(driver, sd.getCoursetab());
		sd.seleniumtrainingtab();
		
		AddtoCartPage d=new AddtoCartPage(driver);
		utilities.doubleclick(driver, d.getAddbtn());
		d.addtocartbtn();
		
	} 

}
