#Autor: xxxxx

@stories
  Feature: Comunity Utest
    a user wants to create their profile on the Utest.com platform


  @Scenario1
  Scenario: Search a button Join Today
    Given john clicks the button join today
    When he begins to fill out the registration form
    | firstName | secondName  | email             | monthBirth  | dayBirth  | yearBirth | city  | zipCode | mobileDevice  | model | operatingSystem | password      |
    | Jhon      | Alvarez     | jonalv3@gmail.com | March       | 10        | 1986      | Medellín  | 0500100 | Apple     | iPhone 3G | iOS 3.0     | Prueba12345+  |
    Then He finally makes his registration on the utest.com platform
    | textCompleteRegister  |
    |Welcome to the world's largest community of freelance software testers!|
