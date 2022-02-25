package Pages;

import Tests.BaseTest;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static Common.Constats.*;
import static com.codeborne.selenide.Selenide.$;

public class ProfilePage extends BaseTest {

    public static SelenideElement favoriteList() {
        return $(By.xpath(FAV_LIST_XPATH));
    }

    public static SelenideElement productInFavorite() {
        return $(By.xpath(PRODUCT_IN_FAV_XPATH));
    }

}