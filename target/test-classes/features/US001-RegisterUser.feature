@register
Feature: US001 Register User


  Scenario: TC01 Kayit sayfasi
    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then sayfanin gorunur oldugunu test eder
    Then kullanici SingUp-Login butonuna tiklar
    And  kullanici New User Signup! yazisinin gorunurlugunu test eder

  Scenario: TC02 Ilk kayit
      When kullanici isim ve mail adresini girer
      Then Singup butonuna tiklar
      Then acilan sayfada ENTER ACCOUNT INFORMATION yazisinin gorunurlugunu test eder
      Then kullanici birinci bolum icin Email, Password, Date of birth kisimlarini doldurur
      Then kullanici Sign up for our newsletter! checkbox' ini secer
      Then kullanici Receive special offers from our partners! checkbox' ini secer
      Then kullanici ikinci bolum icin gerekli kisimlari doldurur
      Then kullnici Creat Account butonuna tiklar
      And  kullanici hesabin olustugunu dogrular


  Scenario: TC03 Hesap silme
    When kullanici Continue butonuna basar
    Then sag ustte olan Logged in as username yazisini gorur
    Then kullanici Delete Account butonuna tiklar
    And  kullanici hesabin silindigini test eder




