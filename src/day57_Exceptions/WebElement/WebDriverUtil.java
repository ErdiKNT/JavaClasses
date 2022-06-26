package day57_Exceptions.WebElement;

/*
create a class WebDriverUtil
    create a method called clickElement that is accepts the WebElement type and calls the click method from those object
 */
public class WebDriverUtil {

    public static void clickElement(WebElement element){
        element.click();
    }

}