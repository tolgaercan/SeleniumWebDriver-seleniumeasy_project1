package StepDefinitions;

import Pages.Page;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class PageStepDefinitions {
    WebDriver driver = DriverFactory.getDriver();
    Page page = new Page(driver);

    @Given("Home Page login")
    public void homePageLogin() {
        page.anasayfa();
    }

    @When("Selenium Button Click")
    public void seleniumButtonClick() {
        page.seleniumbut();
    }

    @When("Selenium with java Button Click")
    public void seleniumWithJavaButtonClick() {
        page.javabut();
    }

    @When("TakeScreenShot scroll row")
    public void takescreenshotScrollRow() {
        page.scroll();
    }

    @When("back to homepage")
    public void backToHomepage() {
        page.back();
    }

    @When("TestNg Button Click")
    public void testngButtonClick() {
        page.testngbut();
    }

    @When("PaceFactory Click")
    public void pacefactoryClick() {
        page.pacefactorybut();
    }

    @When("İf command use false")
    public void ifCommandUseFalse() {
        page.ifcommand();
    }

    @When("if command use true")
    public void ifCommandUseTrue() {
        page.iftrue();
    }

    @When("Click Element Js")
    public void clickElementJs() {
        page.clickjs();
    }

    @When("more button,junit click")
    public void moreButtonJunitClick() {
        page.morebutton();
    }

    @When("if cooman is true next")
    public void ifCoomanIsTrueNext() {
        page.ifcommad1();
    }

    @When("tastengpopularpost clikc")
    public void tastengpopularpostClikc() {
        page.popularpost();
    }

    @When("selecet index{int} click")
    public void selecetIndexClick(int arg0) {
        page.selectinex();

    }

    @When("back homapage")
    public void backHomapage() {
        page.backhomepage();


    }

    @When("Protractor button click")
    public void protractorButtonClick() {
        page.protractorbutton();
    }

    @When("Finding Elements in Protractor clik")
    public void findingElementsInProtractorClik() {
        page.findingelements();
    }

    @When("back")
    public void back() {
        Page.back();
    }

    @When("Capabilities and Options in Protractor click")
    public void capabilitiesAndOptionsInProtractorClick() {
        page.capabilities();
    }

    @When("How to check if an element is present with protractor? click")
    public void howToCheckIfAnElementIsPresentWithProtractorClick() {
        page.howtocheck();
    }

    @When("Run protractor tests on multiple browsers in parallel click")
    public void runProtractorTestsOnMultipleBrowsersInParallelClick() {
        page.runProtractor();
    }

    @When("Using Locators in Protractor click")
    public void usingLocatorsInProtractorClick() {
        page.usingLocators();
    }

    @When("Run multiple protractor specs in parallel click")
    public void runMultipleProtractorSpecsInParallelClick() {
        page.runMultiple();
    }

    @When("Protractor basic example program click")
    public void protractorBasicExampleProgramClick() {
        page.protractorsBasic();
    }

    @When("Installing Protractor click")
    public void ınstallingProtractorClick() {
        page.installing();
    }

    @When("Protractor Introduction click")
    public void protractorIntroductionClick() {
        page.protractorintroduction();
    }


    @When("jenkin button click")
    public void jenkinButtonClick() {
        page.jenkinsclick();
    }

    @When("Jenkins configuration with Maven and GitHub screenshot")
    public void jenkinsConfigurationWithMavenAndGitHubScreenshot() {
            page.jenkinsscreenshot();
    }

    @When("container screenshot")
    public void containerScreenshot() {
        page.containerscreenshot();

    }

    @When("robot screenShot use")
    public void robotScreenShotUse() {
        page.robot();
    }

    @When("element get location")
    public void elementGetLocation() {
        page.location();
    }
}
