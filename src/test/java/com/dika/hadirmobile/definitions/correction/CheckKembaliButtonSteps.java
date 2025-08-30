package com.dika.hadirmobile.definitions.correction;

import org.testng.Assert;

import com.dika.hadirmobile.definitions.authentications.Hook;
import com.dika.hadirmobile.definitions.providers.AuthProviders;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckKembaliButtonSteps extends AuthProviders{
    
    @Given("user sudah berada di halaman koreksi absen untuk pengecekan tombol kembali.")
    public void step01(){
        preConAjukanKoreksi();
        Hook.driver = this;
    }

    @When("user menekan tombol kembali.")
    public void step02() throws InterruptedException{
        koreksiAbsenPage().clickKembaliButton();
        Thread.sleep(2000);
    }

    @Then("user dibawa kembali ke halaman dashboard dengan url {string}.")
    public void step03(String url){
        Assert.assertEquals(dashboardPage().getCurrentURL(), url);
    }
}
