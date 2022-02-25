package Pages;

import Tests.BaseTest;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static Common.Constats.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage extends BaseTest {

    public static SelenideElement searchInput(){
        return $(By.id(SEARCH_ID));
    }

    public static SelenideElement searchTextInput(){
        return $(By.id(SEARCH_TEXT_ID));
    }

    public static SelenideElement searchResultLine (){
        return $(By.className(SEARCH_RESULT_CLASS_NAME));
    }

    public static SelenideElement searchResultLineList (Integer index){
        return $$(By.className(SEARCH_RESULT_CLASS_NAME)).get(index);
    }

    public static SelenideElement searchResultProductNoParams (){
        return $(By.xpath(PRODUCT_WO_PARAMS_XPATH));
    }

    public static SelenideElement searchResultProductWithParams (){
        return $(By.xpath(PRODUCT_WITH_PARAMS_XPATH));
    }

    public static SelenideElement bannerHideButton(){
        return $(By.id(HIDE_BANNER_ID));
    }

    public static SelenideElement backFromSearchButton(){
        return $(By.id(GET_BACK_FROM_SEARCH_ID));
    }

    public static SelenideElement profileMenu (){
        return $(By.xpath(PROFILE_BUTTON_XPATH));
    }


}
