Feature: Cart tests
  As a customer
  I want to add the desired products to cart and proceed to checkout
  so that my basket should be updated with the correct price

  @carttest
  Scenario: Add products to the cart and verify the price at checkout
    Given the customer added the Faded Short Sleeve T Shirt, size medium, colour blue to the cart
    And the customer added the Evening Dress, size small, colour beige to the cart
    And the customer added the Printed Summer Dress, size medium, colour orange to the cart
    When the customer navigated the checkout
    And the customer removed the Evening Dress from the cart
    And the customer added a second Faded Short Sleeve T Shirt of the same size and colour
    Then correct values should be displayed at checkout
