package com.dika.hadirmobile.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KoreksiAbsenPage {
    private WebDriver driver;

    @FindBy(xpath = "//button[normalize-space()='Ajukan Koreksi']")
    public WebElement ajukanKoreksiButton;

    @FindBy(xpath = "//div[@class='MuiBox-root css-pampsj']//div[1]//div[1]//div[1]//div[1]//button[1]//*[name()='svg']")
    private WebElement jamMasukButton;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/*[name()='svg'][1]")
    private WebElement jamKeluarButton;

    @FindBy(id = "is_wfh")
    public WebElement pilihTipeAbsen;

    @FindBy(xpath = "//button[normalize-space()='Ajukan']")
    private WebElement ajukanButton;

    @FindBy(css = ".MuiTypography-root.MuiTypography-body1.css-1ub5lza")
    private WebElement total;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/p[4]")
    private WebElement tipeAbsen;

    @FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1 css-1bwr8un'])[1]")
    private WebElement pesanError;

    @FindBy(xpath = "//button[normalize-space()='Reset']")
    private WebElement resetButton;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    private WebElement jamMasukField;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
    private WebElement jamKeluarField;

    @FindBy(xpath = "(//*[name()='svg'][@class='feather feather-chevron-left '])[1]")
    private WebElement kembaliButton;

    public KoreksiAbsenPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
  
    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }

    public void clickAjukanKoreksiButton(){
        ajukanKoreksiButton.click();
    }

    public void clickJamMasukButton(){
        jamMasukButton.click();
    }

    public void clickJamKeluarButton(){
        jamKeluarButton.click();
    }

    public void clickPilihTipeAbsen(){
        pilihTipeAbsen.click();
    }

    public void clickAjukanButton(){
        ajukanButton.click();
    }

    public int getTotal(){
        String fullText = total.getText();
        String[] parts = fullText.split(" ");
        String numberString = parts[parts.length - 1]; 
        return Integer.parseInt(numberString);
    }

    public String getTipeAbsen(){
        String fullText =tipeAbsen.getText();
        String[] parts = fullText.split(" ");
        return parts[parts.length - 1]; 
    }
    
    public String getPesanError(){
        return pesanError.getText();
    }

    public void clickResetButton(){
        resetButton.click();
    }

    public void clickKembaliButton(){
        kembaliButton.click();
    }

    public boolean isJamMasukFieldEmpty(){
        return jamMasukField.getAttribute("value").isEmpty();
    }

    public boolean isJamKeluarFieldEmpty(){
        return jamKeluarField.getAttribute("value").isEmpty();
    }

    public boolean isPilihTipeAbsenNotDisplayed() {
    try {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("is_wfh")));
        return !element.isDisplayed();
    } catch (TimeoutException e) {
        return true; 
    }
}
}
