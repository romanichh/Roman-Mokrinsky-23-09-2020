package tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import repo.SessionRepo;

public class First extends TestBase {

    @BeforeMethod
    public void preconditions() {
        if (!app.getSession().logoIsPresent()) {
            app.getSession().opening();
        }
    }

    @Test
    public void openSiteTest() {
        app.getSession().isElementPresent(By.cssSelector(SessionRepo.footer));

    }


}
