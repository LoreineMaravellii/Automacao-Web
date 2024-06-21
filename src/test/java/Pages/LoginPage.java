package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.clicar;
import static Utils.Utils.digitar;

public class LoginPage extends RunCucumberTest {

    @FindBy(id = "customer_email")
    private WebElement txtEmail;

    @FindBy(id = "customer_password")
    private WebElement txtSenha;

    @FindBy(css = "#customer_login > div.action_bottom > input")
    private WebElement btnLogin;

    public LoginPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void digitarEmail(){
        digitar(txtEmail,"cursouniversidadeqa@gmail.com");
    }

    public void digitarSenha(){
        digitar(txtSenha, "universidade123");
    }

    public void clicarBtnLogin() throws InterruptedException {
        Thread.sleep(2000);
        clicar(btnLogin);
    }
}
