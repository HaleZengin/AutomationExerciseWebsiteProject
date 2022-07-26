Feature: US0016 Place Order: Login before Checkout

  Scenario: TC01 Ana sayfa
    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then sayfanin gorunur oldugunu test eder
    Then kullanici SingUp-Login butonuna tiklar
    Then kullanici "kayitliEmail" ve "kayitliPassword" girer ve Login butonuna tiklar
    And  kullanici adi ile giris yapildigini dogrular











  7. Add products to cart
  8. Click 'Cart' button
  9. Verify that cart page is displayed
  10. Click Proceed To Checkout
  11. Verify Address Details and Review Your Order
  12. Enter description in comment text area and click 'Place Order'
  13. Enter payment details: Name on Card, Card Number, CVC, Expiration date
  14. Click 'Pay and Confirm Order' button
  15. Verify success message 'Your order has been placed successfully!'
  16. Click 'Delete Account' button
  17. Verify 'ACCOUNT DELETED!' and click 'Continue' button