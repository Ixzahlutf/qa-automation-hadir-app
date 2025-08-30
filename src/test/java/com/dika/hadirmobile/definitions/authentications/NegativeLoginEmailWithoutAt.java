package com.dika.hadirmobile.definitions.authentications;

import org.testng.Assert;

import com.dika.hadirmobile.definitions.providers.AuthProviders;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NegativeLoginEmailWithoutAt extends AuthProviders {
    @Given("pengguna masuk ke halaman login untuk menguji email tanpa '@'.")
    public void step01(){
        preTest();
        Hook.driver = this;
    }

    @When("pengguna memasukkan username {string} dan password {string}.")
    public void step02(String email, String password){
        loginPage().setEmailLogin(email);
        loginPage().setPasswordLogin(password);
    }

    @And("pengguna menekan tombol masuk setelah mengisi data.")
    public void step03(){
        loginPage().clickMasukButton();
    }

    @Then("pengguna melihat pesan kesalahan {string}.")
    public void step04(String errorMessage){
        Assert.assertEquals(loginPage().getValidationMessageLogin(), errorMessage);
    }
}