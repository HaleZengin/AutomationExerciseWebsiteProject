@US13
Feature: US0013 Verify Product quantity in Cart

  Scenario: TC01 Ana sayfa
    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then sayfanin gorunur oldugunu test eder
    Then kullanici ana sayfadan herhangi bir urunun View Product butonuna tiklar

  Scenario: TC02 Sepetteki urun miktarini dogrulama
    When kullanici urun detay sayfasinin acildigini dogrular
    Then kullanici urun miktarini dorde cikarir
    Then kullanici Add to Card butonuna basar
    Then kullanici View Cart butonuna tiklar
    And  kullanici urun miktarinin sectigi miktarla esit oldugunu test eder
    And  kullanici sayfayi kapatir