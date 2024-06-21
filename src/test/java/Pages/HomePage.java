package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.clicar;
import static Utils.Utils.digitar;

public class HomePage extends RunCucumberTest {

    @FindBy(css = "#logo > a")
    private WebElement btnSimple;

    @FindBy(id = "product-2")
    private WebElement jacket2;

    @FindBy(css = "#minicart > a.checkout")
    private WebElement btnCheckOut;

    public HomePage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void clicarBtnSimple() throws InterruptedException {
        Thread.sleep(2000);
        clicar(btnSimple);
    }

    public void clicarjacket2 (){
        clicar(jacket2);
    }

    public void clicarBtnCheckOut() {
        clicar(btnCheckOut);
    }
}
