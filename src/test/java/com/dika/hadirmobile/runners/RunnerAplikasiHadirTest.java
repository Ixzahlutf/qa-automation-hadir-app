package com.dika.hadirmobile.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {
        "src/test/resources/features/01_Authentication.feature",
        // "src/test/resources/features/02_AbsenMasukKeluar.feature",
        // "src/test/resources/features/03_HistoryAbsensi.feature",
        "src/test/resources/features/04_KoreksiAbsen.feature",
        // "src/test/resources/features/06_Lembur.feature",
        // "src/test/resources/features/07_Cuti.feature"
}, glue = {
        "com.belajar.cucumber.definitions.authentications",
        // "com.belajar.cucumber.definitions.absenMasukKeluar",
        // "com.belajar.cucumber.definitions.absensi",
        // "com.belajar.cucumber.definitions.lembur",
        // "com.belajar.cucumber.definitions.cuti",
        "com.belajar.cucumber.definitions.correction",
}, plugin = {
        "pretty",  
        "html:target/cucumber-reporting/reports.html", 
        "json:target/cucumber-reporting/reports.json", 
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class RunnerAplikasiHadirTest extends AbstractTestNGCucumberTests {
}
