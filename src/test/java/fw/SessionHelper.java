package fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import repo.SessionRepo;

public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver driver) {
        super(driver);
    }

    public void opening() {
        driver.get(SessionRepo.siteUrl);
    }

    public boolean logoIsPresent() {
        return isElementPresent(By.cssSelector(SessionRepo.companyLogo));
    }
}
