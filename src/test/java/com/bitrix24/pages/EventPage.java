package com.bitrix24.pages;

import com.bitrix24.utulities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventPage {
    public EventPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "bx-b-uploadfile-blogPostForm_calendar")
    public WebElement uploadFiles;
    @FindBy(xpath = "//*[@id='bx-b-link-blogPostForm_calendar']/span")
    public WebElement link;
    @FindBy(xpath = "//*[@id='bx-b-video-blogPostForm_calendar']/span")
//    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-video bxhtmled-top-bar-btn-active']")

    public WebElement insertVideo;
    @FindBy(xpath = "//*[@id='bx-b-quote-blogPostForm']/span")
    public WebElement quoteText;


    @FindBy(id = "diskuf-selectdialog-Qu582nn")
    public WebElement table;


    @FindBy(xpath = "(//td[@class='diskuf-selector wd-fa-add-file-light-cell wd-fa-add-file-from-main'])[3]")
    //@FindBy(xpath = "//*[@id=diskuf-selectdialog-DnNLHhh]/div[2]/table/tbody/tr/td")
    public WebElement UploadFilesAndImages;

    @FindBy(xpath = "(//td[@class='wd-fa-add-file-light-cell'])[7]")
    public WebElement selectDocumentFromBitrix24;

    @FindBy(xpath = "//*[@id='diskuf-selectdialog-DnNLHhh']/div[2]/table/tbody/tr[3]/td[3]")
    public WebElement createUsingDesktopApplications;

    @FindBy(xpath = "//*[@id='diskuf-selectdialog-DnNLHhh']/div[2]/table/tbody/tr[3]/td[1]")
    public WebElement downloadFromExternalDrive;

    @FindBy(id = "check-in-text-n2321")
    public WebElement saveButton;

    @FindBy(xpath = "//input[@id='linkoCalEditorcal_3Jcl-text']")
    public WebElement linkText;

    @FindBy(xpath = "//input[@id='linkoCalEditorcal_3Jcl-href']")
    public WebElement linkURL;



     @FindBy(xpath = "//*[@id='bx-html-editor-iframe-cnt-oCalEditorcal_3Jcl']/iframe")
    public WebElement iFrame;

    @FindBy(xpath = "//body[@style='min-height: 104px;']")
    public WebElement verificationLinkText;

    @FindBy(xpath="//input[@id='video_oCalEditorcal_3Jcl-source']")
    public WebElement VideoSource;

    @FindBy(xpath = "//*[@class='bxhtmled-video-error']")
    public WebElement message404;

    //@FindBy(xpath = "//*[@class='bxhtmled-quote']")
    @FindBy(linkText = "blockquote")
    public WebElement QuoteInput;


}