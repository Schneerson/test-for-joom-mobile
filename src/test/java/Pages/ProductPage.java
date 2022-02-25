package Pages;

import Tests.BaseTest;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static Common.Constats.*;
import static com.codeborne.selenide.Selenide.$;

public class ProductPage extends BaseTest {

    public static SelenideElement addToCartButton(){
        return $(By.id(ADD_TO_CART_BUTTON_ID));
    }

    public static SelenideElement sizeOption(){
        return $(By.xpath(SIZE_PARAM));
    }

    public static SelenideElement colourOption(){
        return $(By.xpath(COLOUR_PARAM));
    }

    public static SelenideElement addButton(){
        return $(By.id(ADD_BUTTON_ID));
    }

    public static SelenideElement getBackButton(){
        return $(By.id(GET_BACK_BUTTON_ID));
    }

    public static SelenideElement addToFavButton(){
        return $(By.id(ADD_TO_FAV_BUTTON_ID));
    }

    public static SelenideElement productName(){
        return $(By.id(PRODUCT_NAME_ID));
    }

    public static SelenideElement descriptionButton(){
        return $(By.id(DESCRIPTION_BUTTON_ID));
    }

    public static SelenideElement descriptionWindowTitle(){
        return $(By.xpath(DESCRIPTION_HEAD_XPATH));
    }
}
