Feature: US0016 Place Order: Login before Checkout

  Scenario: TC01 Ana sayfa
    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then sayfanin gorunur oldugunu test eder
    Then kullanici SingUp-Login butonuna tiklar
    Then kullanici "kayitliEmail" ve "kayitliPassword" girer ve Login butonuna tiklar

  Scenario: TC03 Urunu sepete ekleme
    When kullanici sayfayi asagiya kaydirir
    When kullanici sayfayi asagiya kaydirir
    Then kullanici sepete urun ekler
    Then kullanici sepet sayfasinin gorunur oldugunu test eder
    Then kullanici odemeye devam et butonuna tiklar
    Then kullanici girilen adres bilgilerini ve siparisi dogrular
    And  kullanici text kismina bir aciklama girer ve place order butonuna tiklar

  Scenario: TC04 Odeme
    When kullanici odeme ayrintilarini doldurur
    Then kullanici Pay and Confirm Order butonuna tiklar
    Then kullanici Your order has been placed successfully! yazisini gorur
    Then kullanici Delete Account butonuna tiklar
    And  kullanici Account Deleted! yazisini gorur ve Continue butonuna tiklar
    And  kullanici sayfayi kapatir












