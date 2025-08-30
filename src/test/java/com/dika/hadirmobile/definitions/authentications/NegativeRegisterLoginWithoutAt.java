package com.dika.hadirmobile.definitions.authentications;

import com.dika.hadirmobile.definitions.providers.AuthProviders;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NegativeRegisterLoginWithoutAt extends AuthProviders {

    @Given("pengguna masuk ke halaman register untuk menguji email tanpa '@'.")
    public void step01(){
        preConRegister();
        Hook.driver = this;
    }

    @When("pengguna masukkan email {string} dan data lainnya.")
    public void step02(String email) throws InterruptedException{
        registerPage().setNIK("D5768907");
        registerPage().setFullname("Kelompok 4");
        registerPage().setEmailRegister(email);
        registerPage().setPasswordRegister("haloo123");
        String filePath = getPhotoPath("test-photo.jpg");
        registerPage().setUploadSelfie(filePath);
        Thread.sleep(1000);
    }

    @And("pengguna tekan tombol masuk setelah mengisi data.")
    public void step03(){
        registerPage().clickDaftarButton();
    }

    @Then("pengguna lihat pesan kesalahan {string}.")
    public void step04(String errorMessage){
        System.out.println(registerPage().getValidationMessageRegister());
    }
}
