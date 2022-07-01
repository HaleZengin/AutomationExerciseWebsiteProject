@US8
Feature: US 0008 Verify All Products and product detail page

  Scenario: TC01 Products Butonu
    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then sayfanin gorunur oldugunu test eder
    Then kullanici Products butonuna tiklar
    And  kullanici sayfaya gittigini dogrular


    Scenario: TC02 Ilk urune tiklama
      When kullanici urun listesini gorur
      Then ilk urunun urunu goruntule butonuna tiklar
      Then kullanici urun detay sayfasina gider
      Then kullanici urun detaylarinin gorunurlugunu dogrular - product name, category, price, availability, condition, brand
      And  kullanici sayfayi kapatir




