Feature: US0015 Place Order: Register before Checkout

  Scenario: TC01 Ana sayfa
    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then sayfanin gorunur oldugunu test eder
    Then kullanici SingUp-Login butonuna tiklar

  Scenario: TC02 Hesap olusturma
    When kullanici isim ve mail adresini girer
    Then Singup butonuna tiklar
    Then acilan sayfada ENTER ACCOUNT INFORMATION yazisinin gorunurlugunu test eder
    Then kullanici birinci bolum icin Email, Password, Date of birth kisimlarini doldurur
    Then kullanici Sign up for our newsletter! checkbox' ini secer
    Then kullanici Receive special offers from our partners! checkbox' ini secer
    Then kullanici ikinci bolum icin gerekli kisimlari doldurur
    Then kullnici Creat Account butonuna tiklar
    And  kullanici hesabin olustugunu dogrular

  Scenario: TC03 Urunu sepete ekleme
    When kullanici adi ile giris yapildigini dogrular
    Then kullanici sepete urun ekler
    Then kullanici sepet sayfasinin gorunur oldugunu test eder
    Then kullanici odemeye devam et butonuna tiklar
    Then kullanici girilen adres bilgilerini ve siparisi dogrular
    And  kullanici text kismina bir aciklama girer ve place order butonuna tiklar

