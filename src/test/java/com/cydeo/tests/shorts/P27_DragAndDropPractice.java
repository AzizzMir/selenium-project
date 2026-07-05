package com.cydeo.tests.shorts;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class P27_DragAndDropPractice {

    @Test
    public void dragAndDropTest() {

        Driver.getDriver().get("https://www.qa-practice.com/elements/dragndrop/boxes");

        WebElement smallRec = Driver.getDriver().findElement(By.id("rect-draggable"));
        WebElement bigRec = Driver.getDriver().findElement(By.id("rect-droppable"));

        Actions actions = new Actions(Driver.getDriver());
//        actions.dragAndDrop(smallRec, bigRec).perform();

        actions.moveToElement(smallRec).pause(1000).clickAndHold().pause(1000).moveToElement(bigRec).pause(1000).release().perform();
    }

}
