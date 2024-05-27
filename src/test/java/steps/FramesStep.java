package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;

public class FramesStep extends BaseStep {
    public FramesStep(WebDriver driver) {
        super(driver);
    }

    public void openFramePage(){
        framesPage.openPageByUrl();
    }


}
