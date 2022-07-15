
@14
Feature: US0014 Place Order: Register while Checkout

  Scenario: TC01 Ana sayfa
    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then sayfanin gorunur oldugunu test eder
    And  kullanici sayfayi asagiya kaydirir


  Scenario: TC02 Urunu sepete ekleme
    Then kullanici ana sayfadan herhangi bir urunu sepete ekler
    Then kullanici View Cart butonuna tiklar
    Then kullanici sectigi urunun sepette oldugunu dogrular
    And  kullanici Proceed To Checkout butonuna tiklar


  Scenario: TC03 Kayit olusturma
    When kullanici Register  Login butonuna tiklar
    When kullanici isim ve mail adresini girer
    Then Singup butonuna tiklar
    Then acilan sayfada ENTER ACCOUNT INFORMATION yazisinin gorunurlugunu test eder
    Then kullanici birinci bolum icin Email, Password, Date of birth kisimlarini doldurur
    Then kullanici Sign up for our newsletter! checkbox' ini secer
    Then kullanici Receive special offers from our partners! checkbox' ini secer
    Then kullanici ikinci bolum icin gerekli kisimlari doldurur
    Then kullnici Creat Account butonuna tiklar
    Then kullanici hesabin olustugunu dogrular
    Then kullanici Continue butonuna basar
    Then sag ustte olan Logged in as username yazisini gorur

  Scenario: TC04 Siparis verme
    When kullanici Cart butonuna tiklar
    Then kullanici Proceed To Checkout butonuna tiklar
    Then kullanici adres bilgilerini ve siparisi dogrular
    Then kullanici text kismina aciklama girer ve Place Order butonuna tiklar
    Then kullanici odeme ayrintilarini doldurur
    Then kullanici Pay and Confirm Order butonuna tiklar
    Then kullanici Your order has been placed successfully! yazisini gorur
    Then kullanici Delete Account butonuna tiklar
    And  kullanici Account Deleted! yazisini gorur ve Continue butonuna tiklar
    And  kullanici sayfayi kapatir


