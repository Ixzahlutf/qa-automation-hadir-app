package com.dika.hadirmobile.definitions.absenMasukKeluar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.dika.hadirmobile.definitions.authentications.Hook;
import com.dika.hadirmobile.definitions.providers.AuthProviders;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AbsenMasukSteps extends AuthProviders{
    @Given("pengguna berada pada halaman dashboard untuk absen masuk.")
    public void step01(){
        preConditionLogin();
        Hook.driver = this;
    }

    @When("pengguna menekan tombol absen masuk.")
    public void step02(){
        dashboardPage().clickAbsenMasukButton();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//video[@class='camera__capture'])[1]")));
    }

    @When("pengguna menekan button kamera untuk ambil foto.")
    public void step03() throws InterruptedException{
        dashboardPage().clickCameraButton();
        Thread.sleep(4000);
    }

    @And("pengguna menekan tombol submit untuk mengirim absen.")
    public void step04(){
        dashboardPage().clickSubmitAbsenMasukButton();
    }

    @Then("pengguna berhasil absen masuk dan tombol absen masuk tidak terlihat.")
    public void step05() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));

        Boolean isInvisible = wait.until(driver -> 
        !dashboardPage().submitAbsenMasukButton.isDisplayed()
        );

        Assert.assertTrue(isInvisible, "Tombol absen masuk masih terlihat padahal seharusnya hilang setelah absen masuk");
    }
}
