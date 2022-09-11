package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import POMPages.CoreJavaPage;
import POMPages.SkillraryLoginPage;
import POMPages.WishListPage;


public class TestCase3 extends BaseClass {
	
	@Test
	public void tc3() throws IOException, InterruptedException {
	SkillraryLoginPage s = new SkillraryLoginPage(driver);
	s.searchtextbox(pdata.getpropertydata("coursedata"));
	s.searchbutton();
	
	CoreJavaPage c = new CoreJavaPage(driver);
	c.seleniumtraining();
	
	utilities.switchFrame(driver);
	
	WishListPage w = new WishListPage(driver);
	w.playbutton();
	Thread.sleep(10000);
	w.pausebutton();
	
	utilities.switchbackFrame(driver);
	w.addtowishlistbtn();
	Thread.sleep(3000);
	
	}
}
