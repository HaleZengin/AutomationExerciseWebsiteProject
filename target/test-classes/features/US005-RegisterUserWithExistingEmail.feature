Feature: US005 Register User with existing email

  Scenario: TC01 Ana sayfa
    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then sayfanin gorunur oldugunu test eder
    Then kullanici SingUp-Login butonuna tiklar
    And  kullanici New User Signup! yazisinin gorunurlugunu test eder

  Scenario: TC02 Kayit
    When kullanici isim ve mail adresini girer
    Then Singup butonuna tiklar
    And  kullanici Email Address already exist! yazisini gorur
    And  kullanici sayfayi kapatir


