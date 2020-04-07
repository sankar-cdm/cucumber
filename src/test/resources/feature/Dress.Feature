Feature: check all the products
Scenario Outline: verify product count
Given User opens the application
When User click the "<tab>"

Then User should see the same number of products count matching with the product header count displayed

Examples:
|tab|
|Dresses|

Scenario Outline: verify the product to add to cart
When User click the "<tab>"
And the click on Add to cart button for the product "<product>"
Then the product should added to cart page

Examples:

|tab|products|
|DRESSES|Printed Chiffon Dress|
