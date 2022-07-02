Feature: US0009 Search Product

  Scenario: TC01 Products Butonu
    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then sayfanin gorunur oldugunu test eder
    Then kullanici Products butonuna tiklar
    And  kullanici sayfaya gittigini dogrular

  Scenario: TC02
    When kullanici Search Product kismina urun adi girer ve search butonuna tiklar
    Then kullanici SEARCHED PRODUCTS yazisini gorur
    Then ilk urunun urunu goruntule butonuna tiklar
    And  baslik kisminda girdigi urun adini gorur
    And  kullanici sayfayi kapatir

