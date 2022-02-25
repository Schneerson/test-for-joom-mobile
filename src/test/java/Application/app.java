package Application;

import Pages.CartPage;
import Pages.MainPage;
import Pages.ProductPage;
import Pages.ProfilePage;
import Tests.BaseTest;

import static Common.Constats.PRODUCT_NAME_WITHOUT_PARAMS_FOR_SEARCH;
import static Common.Constats.PRODUCT_NAME_WITH_PARAMS_FOR_SEARCH;

public class app extends BaseTest {

    public static void openProductWithoutParamsPage()  {
        if (MainPage.bannerHideButton().exists()) {
            MainPage.bannerHideButton().click();
        }
            MainPage.searchInput().click();
            MainPage.searchInput().click();
            MainPage.searchInput().click();
            MainPage.searchTextInput().click();
            MainPage.searchTextInput().setValue(PRODUCT_NAME_WITHOUT_PARAMS_FOR_SEARCH);
            MainPage.searchResultLine().click();
            MainPage.searchResultProductNoParams().click();

    }

    public static String getTopProductName() {
        return CartPage.getTopProductName().getText();
    }

    public static String[] getProductsName() {
        String[] productNames = new String[CartPage.getAllProductsName().size()];
        for (int i = 0; i< productNames.length; i++) {
            productNames[i] = CartPage.getAllProductsName().get(i).getText();
        }
        return productNames;
    }


    public static void addProductWithoutParamsInCart() {
        ProductPage.addToCartButton().click();
    }

    public static void openProductWithParamsPage()  {
        if (MainPage.bannerHideButton().exists()) {
            MainPage.bannerHideButton().click();
        }
        MainPage.searchInput().click();
        MainPage.searchInput().click();
        MainPage.searchInput().click();
        MainPage.searchTextInput().setValue(PRODUCT_NAME_WITH_PARAMS_FOR_SEARCH);
        MainPage.searchResultLineList(0).click();
        MainPage.searchResultProductWithParams().click();
    }

    public static void openProductWithParamsPageWithoutClosingAlert()  {
        MainPage.searchInput().click();
        MainPage.searchInput().click();
        MainPage.searchTextInput().setValue(PRODUCT_NAME_WITH_PARAMS_FOR_SEARCH);
        MainPage.searchResultLineList(0).click();
        MainPage.searchResultProductWithParams().click();
    }

    public static void addProductWithParamsInCart() {
        ProductPage.addToCartButton().click();
        ProductPage.colourOption().click();
        ProductPage.sizeOption().click();
        ProductPage.addButton().click();
    }

    public static void addNoParams() {
        ProductPage.addToCartButton().click();
        ProductPage.addButton().click();
    }

    public static void addOneParam() {
        ProductPage.addToCartButton().click();
        ProductPage.colourOption().click();
        ProductPage.addButton().click();
    }

    public static boolean stillInProductMenu() {
        return ProductPage.addButton().exists();
    }

    public static void backInMainPage () {
        ProductPage.getBackButton().click();
        ProductPage.getBackButton().click();
        MainPage.backFromSearchButton().click();
        MainPage.backFromSearchButton().click();
        MainPage.backFromSearchButton().click();
    }

    public static void addToFavorite () {
        ProductPage.addToFavButton().click();
        ProductPage.getBackButton().click();
    }

    public static void openFavoriteList () {
        MainPage.profileMenu().click();
        ProfilePage.favoriteList().click();
        ProfilePage.productInFavorite().click();
    }

    public static String getProductName () {
        return ProductPage.productName().getText();
    }

    public static String getDescriptionHeadText () {
        return ProductPage.descriptionWindowTitle().getText();
    }

    public static void openDescription () {
        ProductPage.descriptionButton().click();
    }


}
