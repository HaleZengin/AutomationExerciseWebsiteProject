@06
Feature: US006 Contact Us Form

  Scenario: TC01 Contact Us butonu
    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then sayfanin gorunur oldugunu test eder
    Then kullanici Contact Us butonuna tiklar
    Then kullanici GET IN TOUCH yazisini gorur

  Scenario: TC02 Contact Us icin detaylarin doldurulmasi
    When kullanici name, email, subject ve message kisimlarini doldurur
    Then kullanici dosyayi yukler
    Then kullanici Submit butonuna tiklar
    Then cikan alert te OK tusuna basar
    Then Success! Your details have been submitted successfully. yazisini gorur
    And  kullanici Home butonuna basar
    And  kullanici anasayfaya gittigini test eder
    And  kullanici sayfayi kapatir

