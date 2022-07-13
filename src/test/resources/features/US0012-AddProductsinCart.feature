Feature: US0012 Add Products in Cart

  Scenario: TC01
    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then sayfanin gorunur oldugunu test eder
    Then kullanici Products butonuna tiklar
    And  kullanici sayfaya gittigini dogrular

  Scenario: TC02 Sepete urun ekleme
    When kullanici ilk urunu sepete ekler
    Then kullanici Continue Shopping butonuna tiklar
    Then kullanici ikinci urunu sepete ekler
    Then kullanici View Cart butonuna tiklar
    Then kullanici sectigi iki urunun de sepette oldugunu dogrular
    And  kullanici fiyatini, toplam fiyatini ve urun miktaini dogrular
    And  kullanici sayfayi kapatir

