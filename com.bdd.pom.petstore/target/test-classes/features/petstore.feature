Feature: PetStore User Actions

Scenario: Launch Application
Given user launches application
When user enters store
Then user verifies the title of WebPage

Scenario: Login to PetStore
Given user launches application
When user enters store
And user logs in with "j2ee" and "j2ee"

Scenario: Browse Fish Category
Given user launches application
When user enters store
And user selects fish category

Scenario: Add Product to Cart
Given user launches application
When user enters store
And user selects fish category
And user selects product
And user adds item to cart
Then item should be added successfully