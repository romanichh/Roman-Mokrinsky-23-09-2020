package fw;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import repo.SlideRepo;

public class SlideHelper extends HelperBase {
    public SlideHelper(WebDriver driver) {
        super(driver);
    }

    public void clientGoogleIsPresent() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(SlideRepo.googleLogoInSlide));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(3000);
        wait(By.xpath(SlideRepo.googleLogoInSlide));
        isElementPresent(By.xpath(SlideRepo.googleLogoInSlide));
    }
}
