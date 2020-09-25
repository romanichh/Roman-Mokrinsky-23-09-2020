package fw;

import model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import repo.MessageRepo;

public class MessageHelper extends HelperBase {

    public MessageHelper(WebDriver driver) {
        super(driver);
    }

    public void sendingOfFooterMessage() {
        fillFooterMessageForm(new ContactData().withName("רומן").withEmail("romich87@gmail.com").withPhone("0542248501"));
        sendFooterMessage();
    }

    private void sendFooterMessage() {
        click(By.cssSelector(MessageRepo.sendButtonOnHeader));
        messageSentNotification();
    }

    private void messageSentNotification() {
        wait(By.cssSelector(MessageRepo.messageSentNotification));
        if (!isElementPresent(By.cssSelector(MessageRepo.messageSentNotification))) {
            return;
        }
    }

    public void fillFooterMessageForm(ContactData contactData) {
        type(By.xpath(MessageRepo.nameFieldOnFooter), contactData.getName());
        type(By.xpath(MessageRepo.emailFieldOnFooter), contactData.getEmail());
        type(By.xpath(MessageRepo.phoneFieldOnFooter), contactData.getPhone());
    }

    public void sendingOfContactMessage() {
        fillContactMessageForm(new ContactData().withName("רומן")
                .withEmail("romich87@gmail.com").withPhone("0542248501").withCompany("TEVA"));
        sendContactMessage();
    }

    private void sendContactMessage() {
        click(By.xpath(MessageRepo.sendContactButton));
        messageSentNotification();
    }

    private void fillContactMessageForm(ContactData contactData) {
        type(By.cssSelector(MessageRepo.nameFieldOnContactMessageForm), contactData.getName());
        type(By.cssSelector(MessageRepo.emailFieldOnContactMessageForm), contactData.getEmail());
        type(By.cssSelector(MessageRepo.phoneFieldOnContactForm), contactData.getPhone());
        type(By.cssSelector(MessageRepo.companyFieldOnContactForm), contactData.getCompany());
    }

    public void sendingMessageFromPopUp() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        waitUntilPopUp(By.cssSelector(MessageRepo.popUpContactForm));
        fillPopUpMessageForm(new ContactData().withName("רומן").withEmail("romich87@gmail.com").withPhone("0542248501"));
        sendMessageFromPopUp();

    }

    private void sendMessageFromPopUp() {
        click(By.cssSelector(MessageRepo.sendMessagePopUpButton));
        messageSentNotification();
    }

    private void fillPopUpMessageForm(ContactData contactData) {
        type(By.xpath(MessageRepo.nameFieldOnPopUp), contactData.getName());
        type(By.xpath(MessageRepo.emailFieldOnPopUp), contactData.getEmail());
        type(By.xpath(MessageRepo.phoneFieldOnPopUp), contactData.getPhone());
    }

    public void waitUntilPopUp(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 150);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
