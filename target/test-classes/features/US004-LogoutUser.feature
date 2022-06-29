Feature: US004 Logout User

  Scenario: TC01 Kayit sayfasi
    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then sayfanin gorunur oldugunu test eder
    Then kullanici SingUp-Login butonuna tiklar
    Then kullanici Login to your account yazisinin gorunurlugunu test eder

  Scenario: TC02 Dogru email ve password ile giris yapma
    When kullanici dogru "email" ve "password" girer
    Then kullanici Login butanuna tiklar
    Then Logged in as username yazisinin gorunur oldugunu test eder

  Scenario: TC03 Giris yaptigi sayfadan cikma
    When kullanici Logout butonuna tiklar
    Then kullanici login sayfasina dondugunu test eder
    And  kullanici sayfayi kapatir

