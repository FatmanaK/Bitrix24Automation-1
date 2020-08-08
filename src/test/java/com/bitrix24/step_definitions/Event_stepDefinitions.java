package com.bitrix24.step_definitions;

import com.bitrix24.pages.EventPage;
import com.bitrix24.pages.MainPage;
import com.bitrix24.utulities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Event_stepDefinitions {
    MainPage mainPage = new MainPage();
    EventPage eventPage = new EventPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    Actions actions = new Actions(Driver.getDriver());

    @When("User clicks the tab{string}")
    public void userClicksTheTab(String tab) {
        wait.until(ExpectedConditions.visibilityOf(mainPage.event));
        switch (tab.toLowerCase()) {
            case "message":
                mainPage.message.click();
                break;
            case "task":
                mainPage.task.click();
                break;
            case "event":
                mainPage.event.click();
                break;
            case "poll":
                mainPage.poll.click();
                break;
            case "more":
                mainPage.more.click();
                break;
            default:
        }
    }

    @When("User clicks the icon {string}")
    public void user_clicks_the_icon(String icon) throws InterruptedException {
        //wait.until(ExpectedConditions.visibilityOf(eventPage.uploadFiles));
        // actions.moveToElement(eventPage.link).perform();
        Thread.sleep(3000);
        switch (icon.toLowerCase()) {
            case "upload files":
                eventPage.uploadFiles.click();
                break;
            case "link":
                eventPage.link.click();
                break;
            case "insert video":
                eventPage.insertVideo.click();
                break;
            case "quote text":
                eventPage.quoteText.click();
                break;

        }

    }

    @When("User clicks the option {string}")
    public void user_clicks_the_option(String options) throws InterruptedException {
        //wait.until(ExpectedConditions.visibilityOf(eventPage.table));
        Thread.sleep(3000);
        switch (options.toLowerCase()) {
            case "upload files and images":
                eventPage.UploadFilesAndImages.sendKeys("/Users/selcuksudemirci/Desktop/UploadPic.png" + Keys.ENTER);

                break;
            case "select document from bitrix24":
                eventPage.selectDocumentFromBitrix24.click();
                break;
            case "create using desktop applications":
                eventPage.createUsingDesktopApplications.click();
                break;
            case "download from external drive":
                eventPage.downloadFromExternalDrive.click();
                break;
        }
        Thread.sleep(3000);
        Driver.closeDriver();
    }

    @When("User {string} files or image from PC")
    public void user_files_or_image_from_pc(String upload) throws InterruptedException {
//Thread.sleep(5000);
//        WebElement choosePic=eventPage.UploadFilesAndImages;
//        Thread.sleep(5000);
//        choosePic.sendKeys(upload);

    }

    @When("User clicks the button {string}")
    public void user_clicks_the_button(String button) {
        //  eventPage.saveButton.click();


    }

    @And("User enters  the link text  {string}")
    public void userEntersTheLinkText(String linkText) throws InterruptedException {
        Thread.sleep(3000);
        eventPage.linkText.sendKeys(linkText);

    }

    @And("User enters link URLand {string}")
    public void userEntersLinkURLand(String url) throws InterruptedException {
        Thread.sleep(3000);
        eventPage.linkURL.sendKeys(url + Keys.ENTER);

    }




    @Then("User should be able to see verification {string}")
    public void userShouldBeAbleToSeeVerification(String verification) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(eventPage.iFrame));
        //Thread.sleep(3000);
        //WebElement iframe = eventPage.iFrame;
        Driver.getDriver().switchTo().frame(1);

        String actualLinkText = eventPage.verificationLinkText.getText();

        Assert.assertEquals(verification, actualLinkText);

    }
    @And("User enters video source  URL {string}")
    public void userEntersVideoSourceURL(String URL) {
        eventPage.VideoSource.sendKeys(URL);

    }

    @Then("User should see verification of upload video{string}")
    public void userShouldSeeVerificationOfUploadVideo(String exceptedVerification) {

        String actual404Message=eventPage.message404.getText();
        System.out.println(actual404Message);


    }


    @And("User enters quote text {string}")
    public void userEntersQuoteText(String quote) {
        Driver.getDriver().switchTo().frame(1);
        eventPage.QuoteInput.sendKeys(quote);



    }

    @Then("User should see the quote {string}")
    public void userShouldSeeTheQuote(String exceptedQuoteVerification) {
        String actualQuote=eventPage.QuoteInput.getText();

        Assert.assertEquals(actualQuote,exceptedQuoteVerification);


    }
}
