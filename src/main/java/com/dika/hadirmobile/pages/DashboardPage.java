package com.dika.hadirmobile.pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
  private WebDriver driver;

  @FindBy(xpath = "//img[@alt='Lembur']")
  private WebElement lemburButton;

  @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1lkqrnd'][normalize-space()='Cuti']")
  private WebElement cutiButton;

  @FindBy(xpath = "//p[normalize-space()='Absensi']")
  private WebElement absenButton;

  @FindBy(xpath = "//img[@alt='menu']")
  private WebElement burgerButton;

  @FindBy(xpath = "//button[normalize-space()='Logout']")
  private WebElement logoutButton;

  @FindBy(xpath = "//img[@alt='Koreksi Absen']")
  private WebElement koreksiIcon;

  @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]")
  private WebElement absenMasukButton;

  @FindBy(xpath = "(//video[@class='camera__capture'])[1]")
  public WebElement videoCamera;

  @FindBy(xpath = "(//*[name()='svg'][@class='feather feather-camera '])[1]")
  public WebElement cameraButton;

  @FindBy(xpath = "(//button[@type='submit'])[1]")
  public WebElement submitAbsenMasukButton;

  public DashboardPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }
  
  public String getCurrentURL() {
    return driver.getCurrentUrl();
  }

  public void clickLemburButton() {
        lemburButton.click();
    }

    public void clickCutiButton() {
        cutiButton.click();
    }

    public void clickAbsenButton(){
        absenButton.click();
    }

    public void clickBurgerButton(){
      burgerButton.click();
    }

    public void clickLogoutButton(){
      logoutButton.click();
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
      wait.until(ExpectedConditions.urlContains("https://magang.dikahadir.com/absen/login"));    
    }

    public void clikKoreksiIcon(){
      koreksiIcon.click();
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      wait.until(ExpectedConditions.urlContains("https://magang.dikahadir.com/apps/absent/correction"));    
    }

    public void clickAbsenMasukButton(){
      absenMasukButton.click();
    }

    public void clickCameraButton(){
      cameraButton.click();
    }

    public void clickSubmitAbsenMasukButton(){
      submitAbsenMasukButton.click();
    }

}