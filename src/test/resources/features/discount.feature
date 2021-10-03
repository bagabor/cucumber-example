Feature: the discount can be retrieved
  Scenario: client makes call to GET discount based on amount
    When the client calls /discounts/5001
    Then the client receives status code of 200
    And the client receives discount equals with 10%