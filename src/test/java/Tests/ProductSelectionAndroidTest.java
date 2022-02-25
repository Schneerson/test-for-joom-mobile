package Tests;

import Application.app;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static Common.Constats.*;


public class ProductSelectionAndroidTest extends BaseTest {

    @Test
    public void addProductWithoutParamsInCart() {
        app.openProductWithoutParamsPage();
        app.addProductWithoutParamsInCart();

        Assertions.assertEquals(PRODUCT_NAME_WITHOUT_PARAMS, app.getTopProductName());
    }

    @Test
    public void addProductWithParamsInCart() {
        app.openProductWithParamsPage();
        app.addProductWithParamsInCart();

        Assertions.assertEquals(PRODUCT_NAME_WITH_PARAMS, app.getTopProductName());
    }

    @Test
    public void addNoParamsForProductWithParamsInCart() {
        app.openProductWithParamsPage();
        app.addNoParams();

        Assertions.assertTrue(app.stillInProductMenu());
    }

    @Test
    public void addOneParamForProductWithParamsInCart() {
        app.openProductWithParamsPage();
        app.addOneParam();

        Assertions.assertTrue(app.stillInProductMenu());
    }

    @Test
    public void addSeveralProductsInCart() {
        app.openProductWithoutParamsPage();
        app.addProductWithoutParamsInCart();
        app.backInMainPage();
        app.openProductWithParamsPageWithoutClosingAlert();
        app.addProductWithParamsInCart();

        Assertions.assertEquals(PRODUCT_NAME_WITH_PARAMS, app.getProductsName()[0]);
        Assertions.assertEquals(PRODUCT_NAME_WITHOUT_PARAMS, app.getProductsName()[1]);
    }

    @Test
    public void addToFavorite() {
        app.openProductWithoutParamsPage();
        String productNameBeforeAddingInFavList = app.getProductName();
        app.addToFavorite();
        app.openFavoriteList();

        Assertions.assertEquals(productNameBeforeAddingInFavList, app.getProductName());
    }

    @Test
    public void openDescription() {
        app.openProductWithoutParamsPage();
        app.openDescription();

        Assertions.assertEquals(DESCRIPTION_TEXT, app.getDescriptionHeadText());
    }
}

