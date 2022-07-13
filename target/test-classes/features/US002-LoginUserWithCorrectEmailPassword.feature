@US2
Feature: US002 Login User With Correct Email and Password

  Scenario: TC01 Ana sayfa
    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then sayfanin gorunur oldugunu test eder
    Then kullanici SingUp-Login butonuna tiklar
    Then kullanici Login to your account yazisinin gorunurlugunu test eder

  Scenario: TC02 Dogru email ve password ile giris yapma
    When kullanici dogru "email" ve "password" girer
    Then kullanici Login butanuna tiklar
    Then Logged in as username yazisinin gorunur oldugunu test eder

  Scenario: TC03 Hesap silme
    When kullanici Delete Account butonuna tiklar
    And  kullanici hesabin silindigini test eder
    And  kullanici sayfayi kapatir

