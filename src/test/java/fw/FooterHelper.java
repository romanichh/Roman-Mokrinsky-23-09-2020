package fw;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import repo.FooterRepo;

import java.util.ArrayList;

public class FooterHelper extends HelperBase {

    public FooterHelper(WebDriver driver) {
        super(driver);
    }

    public void facebookService() {
        if (isElementPresent(By.cssSelector(FooterRepo.facebookIcon))) {
            click(By.cssSelector(FooterRepo.facebookIcon));
        }

        ArrayList<String> availableWindows = new ArrayList<>(driver.getWindowHandles());
        if (!availableWindows.isEmpty()) {
            driver.switchTo().window(availableWindows.get(3));
        }
        wait(By.xpath(FooterRepo.companyLogoOnFacebookPage));
        if (isElementPresent(By.xpath(FooterRepo.companyLogoOnFacebookPage)) == false) {
            return;
        }
        driver.switchTo().window(availableWindows.get(0));
        driver.navigate().refresh();
    }

    public void socialMediaBar() {
        if (isElementPresent(By.cssSelector(FooterRepo.socialMediaIcon))) {
            click(By.cssSelector(FooterRepo.socialMediaIcon));
        }

        ArrayList<String> availableWindows = new ArrayList<>(driver.getWindowHandles());
        if (!availableWindows.isEmpty()) {
            driver.switchTo().window(availableWindows.get(2));
        }
        wait(By.cssSelector(FooterRepo.companyLogoOnSocialMediaPage));
        if (isElementPresent(By.cssSelector(FooterRepo.companyLogoOnSocialMediaPage)) == false) {
            return;
        }
        driver.switchTo().window(availableWindows.get(0));
        driver.navigate().refresh();

    }

    public void whatsappServiceOnLeftSide() {
        if (isElementPresent(By.cssSelector(FooterRepo.whatsAppIconOnLeftSideOnPage))) {
            click(By.cssSelector(FooterRepo.whatsAppIconOnLeftSideOnPage));
        }

        ArrayList<String> availableWindows = new ArrayList<>(driver.getWindowHandles());
        if (!availableWindows.isEmpty()) {
            driver.switchTo().window(availableWindows.get(1));
        }
        wait(By.cssSelector(FooterRepo.whatsAppLogo));
        if (isElementPresent(By.cssSelector(FooterRepo.whatsAppLogo)) == false) {
            return;
        }
        driver.switchTo().window(availableWindows.get(0));
        driver.navigate().refresh();
    }

    public void footerWhatsAppService() {
        if (isElementPresent(By.cssSelector(FooterRepo.footerWhatsAppIcon))) {
            click(By.cssSelector(FooterRepo.footerWhatsAppIcon));
        }

        ArrayList<String> availableWindows = new ArrayList<>(driver.getWindowHandles());
        if (!availableWindows.isEmpty()) {
            driver.switchTo().window(availableWindows.get(4));
        }
        wait(By.cssSelector(FooterRepo.whatsAppLogo));
        if (isElementPresent(By.cssSelector(FooterRepo.whatsAppLogo)) == false) {
            return;
        }
        driver.switchTo().window(availableWindows.get(0));
        driver.navigate().refresh();
    }

    public void linkedInService() {
        if (isElementPresent(By.cssSelector(FooterRepo.linkedInIcon))) {
            click(By.cssSelector(FooterRepo.linkedInIcon));
        }

        ArrayList<String> availableWindows = new ArrayList<>(driver.getWindowHandles());
        if (!availableWindows.isEmpty()) {
            driver.switchTo().window(availableWindows.get(5));
        }
        wait(By.xpath(FooterRepo.companyLogoOnLinkedinPage));
        if (isElementPresent(By.xpath(FooterRepo.companyLogoOnLinkedinPage)) == false) {
            return;
        }
        driver.switchTo().window(availableWindows.get(0));
        driver.navigate().refresh();


    }

    public void managerContactIsPresent() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        isElementPresent(By.cssSelector(FooterRepo.managerContact));
        pause(3000);
    }

    public void scrollUp() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        click(By.cssSelector(FooterRepo.scrollUpButton));
        logoIsPresent();
        pause(3000);
    }
}
