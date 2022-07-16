Feature: Payment Functionality
  Background:
  Given The user wants to go https://demo.guru99.com/payment-gateway/index.php
  Scenario:Header Verification

    Then The user should able to see "Mother Elephant With Babies Soft Toy"
    Scenario: Price Verification

      Then The user wants to verify that the toy price is "Price: $20"
      Scenario: URL contain “payment-gateway” Verification

        Then the URL should contain "payment-gateway"
        Scenario: Payment Verification

          Given The user wants to select quantity as "5"
          When The user wants to click on buy now button
          Then The user wants to enter credit card number as "1234567891234567"
          And The user wants to select expiration month as "07"
          And The user wants to select expiration year as "2027"
          And The user wants to enter CVV Code as "543"
          Then The user wants to click on buy button
          Then The user should able to see "Payment successfull!" message

          Scenario Outline:

            Given The user wants to select "<quantity>"
            When The user wants to click on buy now button
            And The user wants to  enter payment information as
              |CNumber|1234567891234567|
              |EMonth |07              |
              |EYear  |2027            |
              |CVVCode|543             |
            Then The user wants to click on buy button
            Then The user should able to see "Payment successfull!" message
            Examples:
            |quantity|
            |5       |
            |8       |
            |9       |
            |2       |
            |4       |



