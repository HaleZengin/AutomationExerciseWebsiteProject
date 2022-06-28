Feature: US003 Login User with incorrect email and password

  Scenario: TC01 Yanlis email ve password ile giris yapma
    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then sayfanin gorunur oldugunu test eder
    Then kullanici SingUp-Login butonuna tiklar
    Then kullanici Login to your account yazisinin gorunurlugunu test eder
    And  kullanici "invalidEmail" ve "invalidPassword" girer
    Then kullanici Login butanuna tiklar
    And  kullanici Your email or password is incorrect! yazisini gorur

