package fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    FooterHelper footerHelper;
    SessionHelper session;
    MessageHelper message;
    SlideHelper slide;

    WebDriver driver;

    Logger logger = (Logger) LoggerFactory.getLogger(ApplicationManager.class);

    public void init() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        maximize();

        footerHelper = new FooterHelper(driver);
        session = new SessionHelper(driver);
        message = new MessageHelper(driver);
        slide = new SlideHelper(driver);
    }

    public SlideHelper getSlide() {
        return slide;
    }

    public MessageHelper getMessage() {
        return message;
    }

    public FooterHelper getFooterHelper() {
        return footerHelper;
    }

    public SessionHelper getSession() {
        return session;
    }

    public void maximize() {
        driver.manage().window().maximize();
    }

    public void stop() {
        driver.quit();
    }


}
