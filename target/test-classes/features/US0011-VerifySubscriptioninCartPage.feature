Feature: US0011 Verify Subscription in Cart page

  Scenario: TC01 Cart butonu
    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then sayfanin gorunur oldugunu test eder
    Then kullanici Cart butonuna tiklar
    Then kullanici sayfayi asagiya kaydirir
    Then kullanici SUBSCRIPTION yazisinin gorunurlugunu dogrular
    Then kullanici mail adresini girer ve ok dugmesine basar
    Then kullanici You have been successfully subscribed! yazisini dogrular
    And kullanici sayfayi kapatir


