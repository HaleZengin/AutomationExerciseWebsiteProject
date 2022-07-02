Feature: US0007 Verify Test Cases Page

  Scenario: TC01 test Case Butonu
    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then sayfanin gorunur oldugunu test eder
    Then kullanici Test Case butonuna tiklar
    And  kullanici Test Case sayfasinin acildigini test eder
    And  kullanici sayfayi kapatir

