Feature: US0010 Verify Subscription in home page

  @s
  Scenario: TC01 Subscription

    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then sayfanin gorunur oldugunu test eder
    Then kullanici sayfayi asagiya kaydirir
    Then kullanici SUBSCRIPTION yazisinin gorunurlugunu dogrular
    And  kullanici mail adresini girer ve ok dugmesine basar
    Then kullanici You have been successfully subscribed! yazisini dogrular
    And  kullanici sayfayi kapatir

