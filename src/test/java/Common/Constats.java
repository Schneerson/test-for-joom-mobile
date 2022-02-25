package Common;

public interface Constats {

    String PRODUCT_NAME_WITHOUT_PARAMS = "Посуда Часть Микроволновая печь Пищевая крышка Анти напыление " +
            "Стойкая к истиранию Крышка Бар Свежая Крышка Чехол Кухонный аксессуар";
    String PRODUCT_NAME_WITH_PARAMS =
            "Мужчины с длинным рукавом халат мягкий лаунж одежда дом пальто зимнее теплое платье халат";
    String PRODUCT_WO_PARAMS_XPATH = "//android.widget.ImageView[@content-desc='Товар Посуда Часть Микроволновая печь Пищевая крышка " +
            "Анти напыление Стойкая к истиранию Крышка Бар Свежая Крышка Чехол Кухонный аксессуар']";
    String PRODUCT_WITH_PARAMS_XPATH = "//android.widget.ImageView[@content-desc='Товар Мужчины с длинным " +
            "рукавом халат мягкий лаунж одежда дом пальто зимнее теплое платье халат']";
    String COLOUR_PARAM = "(//android.widget.ImageView[@content-desc='Цвет Чёрный'])[2]";
    String SIZE_PARAM = "(//android.view.ViewGroup[@content-desc='Размер L'])[2]";
    String PRODUCT_NAME_WITH_PARAMS_FOR_SEARCH = "халат мужской";
    String PRODUCT_NAME_WITHOUT_PARAMS_FOR_SEARCH = "Микроволновая крышка";

    String FAV_LIST_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget." +
            "RecyclerView/android.widget.Button[1]";
    String PRODUCT_IN_FAV_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android." +
            "widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/androidx.viewpager." +
            "widget.a/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup";
    String DESCRIPTION_HEAD_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android." +
            "widget.FrameLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget." +
            "FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TextView";
    String DESCRIPTION_TEXT = "Описание";
    String ADD_BUTTON_ID = "com.joom:id/button";
    String SEARCH_ID = "com.joom:id/search";
    String SEARCH_TEXT_ID = "com.joom:id/search_field_input";
    String SEARCH_RESULT_CLASS_NAME = "android.widget.Button";
    String HIDE_BANNER_ID = "com.joom:id/bottom_sheet_indicator";
    String ADD_TO_CART_BUTTON_ID = "com.joom:id/purchase_bar_large_button";
    String PRODUCT_NAME_IN_CART_ID = "com.joom:id/header_title";
    String GET_BACK_BUTTON_ID = "com.joom:id/toolbar_navigation_button";
    String GET_BACK_FROM_SEARCH_ID = "com.joom:id/search_field_start_button";
    String ADD_TO_FAV_BUTTON_ID = "com.joom:id/icon";
    String DESCRIPTION_BUTTON_ID = "com.joom:id/row_layout_title";
    String PROFILE_BUTTON_XPATH = "//android.widget.ImageView[@content-desc='Профиль']";
    String PRODUCT_NAME_ID = "com.joom:id/product_info_title";



}
