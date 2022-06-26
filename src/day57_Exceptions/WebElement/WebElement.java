package day57_Exceptions.WebElement;

/*create an interface WebElement
    create abstract methods:
        void click()
        String getText()
        void sendKeys(String txt)
 */
public interface WebElement {

    public abstract void click();
    String getText();
    void sendKeys(String txt);

}