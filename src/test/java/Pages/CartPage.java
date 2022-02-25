package Pages;

import Tests.BaseTest;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static Common.Constats.PRODUCT_NAME_IN_CART_ID;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CartPage extends BaseTest {

    public static SelenideElement getTopProductName(){
        return $(By.id(PRODUCT_NAME_IN_CART_ID));
    }

    public static ElementsCollection getAllProductsName(){
        return $$(By.id(PRODUCT_NAME_IN_CART_ID));
    }

}
