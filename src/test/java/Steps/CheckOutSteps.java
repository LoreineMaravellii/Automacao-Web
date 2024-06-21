package Steps;

import Pages.CheckOutPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CheckOutSteps {

    private static final String TITLE_PEDIDO = "Noir jacket - L / Red";
    CheckOutPage checkOutPage = new CheckOutPage();

    @Then("verifico se o titulo do pedido esta correto")
    public void verificoSeOTituloDoPedidoEstaCorreto() {
        Assert.assertEquals(checkOutPage.pegarTituloProduto(),TITLE_PEDIDO);
    }
}
