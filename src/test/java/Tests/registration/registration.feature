Feature: Registration

  Scenario Outline: New user enter email to signup
    Given Home page open
    When User click on signup button
    Then Authentication page open
    When User enter "<Email>"
    Then create an account button is clickable
    When User click on Create new account button
    Then Signup page open successfully
    Examples:
      | Email  |
      | emailValid1 |


    Scenario Outline:  User enter invalid email to signup
      Given Home page open
      When User click on signup button
      Then Authentication page open
      When User enter "<Email>"
      Then create an account button is clickable
      When User click on Create new account button
      Then Error message appear with text "<Message>"

      Examples:
        | Email  | Message|
        #this Email already registered before
        | emailAlreadyExist| existAccount       |
        #the Email Domain wrong
        | emailWrongDomain | invalidEmail       |
        #Email field is blank
        | emailBlank       | invalidEmail       |


  Scenario Outline: New user  signup with valid data
    Given Home page open
    When User click on signup button
    Then Authentication page open
    When User enter "<Email>"
    Then create an account button is clickable
    When User click on Create new account button
    Then Signup page open successfully
    When User Choose the gender "<Title>"
    And User enter the First Name as "<FirstName>"
    And User enter the Last Name as "<LastName>"
    And User enter the Password as "<Password>"
    And Choose the Day as "<Day>"
    And Choose the Month as "<Month>"
    And Choose the year as "<Year>"
    And User enter Address1 as "<Address>"
    And User enter City as a "<City>"
    And User choose State as "<State>"
    And User enter PostCode as "<PostCode>"
    And User Choose Country as "<Country>"
    And User enter Mobile number as "<Mobile>"
    And User check on offers box
    And User check on newsletter box
    And User enter Company as "<Company>"
    And User enter Home Number as "<Home_Number>"
    And User enter Additional Information as"<Additional_info>"
    Then signup button should be clickable
    When User click on submit button
    Then User account page open successfully

    Examples:
      | Email  | Title|FirstName|LastName|Password|Day|Month|Year|Address|City|State|PostCode|Country|Mobile|Company|Home_Number|Additional_info|
      #User enter all field with right data
      | emailValid3 |TitleM|  fName1   |  lName      |  pass      |day|month|year|address|city|state|postcode|country|mobile|company|home_number|additional_info|
     #User enter only mandatory data
      | emailValid4 |TitleF|  fName2   |  lName      |  pass      |day|month|year|address|city|state|postcode|country|mobile|companyBlank|home_numberBlank|additional_infoBlank|

  Scenario Outline: New user  signup with Blank fields
    Given Home page open
    When User click on signup button
    Then Authentication page open
    When User enter "<Email>"
    Then create an account button is clickable
    When User click on Create new account button
    Then Signup page open successfully
    When User Choose the gender "<Title>"
    And User enter the First Name as "<FirstName>"
    And User enter the Last Name as "<LastName>"
    And User enter the Password as "<Password>"
    And Choose the Day as "<Day>"
    And Choose the Month as "<Month>"
    And Choose the year as "<Year>"
    And User enter Address1 as "<Address>"
    And User enter City as a "<City>"
    And User choose State as "<State>"
    And User enter PostCode as "<PostCode>"
    And User Choose Country as "<Country>"
    And User enter Mobile number as "<Mobile>"
    And User check on offers box
    And User check on newsletter box
    And User enter Company as "<Company>"
    And User enter Home Number as "<Home_Number>"
    And User enter Additional Information as"<Additional_info>"
    Then signup button should be clickable
    When User click on submit button
    Then Error message Appear with the text "<Message>"
    Examples:
      | Email  | Title|FirstName|LastName|Password|Day|Month|Year|Address|City|State|PostCode|Country|Mobile|Company|Home_Number|Additional_info|Message|
      #Keep First name Blank
      | emailValid1 |TitleM|  fNameBlank  |  lName      |  pass      |day|month|year|address|city|state|postcode|country|mobile|company|home_number|additional_info|fNameRequired|
      #Keep Last name Blank
      | emailValid2 |TitleF|  fName2   |  lNameBlank      |  pass      |day|month|year|address|city|state|postcode|country|mobile|companyBlank|home_numberBlank|additional_infoBlank|lnameRequired|
     #Keep Password Blank
      | emailValid1 |TitleM|  fName1   |  lName      |  passBlank      |day|month|year|address|city|state|postcode|country|mobile|company|home_number|additional_info|passRequired|
      #Keep day Blank
      | emailValid2 |TitleF|  fName2   |  lName      |  pass      |dayBlank|month|year|address|city|state|postcode|country|mobile|companyBlank|home_numberBlank|additional_infoBlank|invalidDate|
      #Keep month Blank
      | emailValid1 |TitleM|  fName1   |  lName      |  pass      |day|monthBlank|year|address|city|state|postcode|country|mobile|company|home_number|additional_info|invalidDate|

      #Keep year blank
      | emailValid2 |TitleF|  fName2   |  lName      |  pass      |day|month|yearBlank|address|city|state|postcode|country|mobile|companyBlank|home_numberBlank|additional_infoBlank|invalidDate|
      #Keep address1 blank
      | emailValid1 |TitleM|  fName1   |  lName      |  pass      |day|month|year|addressBlank|city|state|postcode|country|mobile|company|home_number|additional_info|addressRequired|
      #Keep city blank
      | emailValid2 |TitleF|  fName2   |  lName      |  pass      |day|month|year|address|cityBlank|state|postcode|country|mobile|companyBlank|home_numberBlank|additional_infoBlank|cityRequired|
      #Keep State blank
      | emailValid1 |TitleM|  fName1   |  lName      |  pass      |day|month|year|address|city|stateBlank|postcode|country|mobile|company|home_number|additional_info|stateRequired|
      #Keep postal code blank
      | emailValid2 |TitleF|  fName2   |  lName      |  pass      |day|month|year|address|city|state|postcodeBlank|country|mobile|companyBlank|home_numberBlank|additional_infoBlank|postcodeRequired|
      #Keep country blank
      | emailValid1 |TitleM|  fName1   |  lName      |  pass      |day|month|year|address|city|state|postcode|countryBlank|mobile|company|home_number|additional_info|countryRequired|
      #keep mobile number blank
      | emailValid2 |TitleF|  fName2   |  lName      |  pass      |day|month|year|address|city|state|postcode|country|mobileBlank|companyBlank|home_numberBlank|additional_infoBlank|mobileRequired|

  Scenario Outline: New user  signup with Password less than five character
    Given Home page open
    When User click on signup button
    Then Authentication page open
    When User enter "<Email>"
    Then create an account button is clickable
    When User click on Create new account button
    Then Signup page open successfully
    When User Choose the gender "<Title>"
    And User enter the First Name as "<FirstName>"
    And User enter the Last Name as "<LastName>"
    And User enter the Password as "<Password>"
    And Choose the Day as "<Day>"
    And Choose the Month as "<Month>"
    And Choose the year as "<Year>"
    And User enter Address1 as "<Address>"
    And User enter City as a "<City>"
    And User choose State as "<State>"
    And User enter PostCode as "<PostCode>"
    And User Choose Country as "<Country>"
    And User enter Mobile number as "<Mobile>"
    And User check on offers box
    And User check on newsletter box
    And User enter Company as "<Company>"
    And User enter Home Number as "<Home_Number>"
    And User enter Additional Information as"<Additional_info>"
    Then signup button should be clickable
    When User click on submit button
    Then Error message Appear with the text "<Message>"
        Examples:
      | Email  | Title|FirstName|LastName|Password|Day|Month|Year|Address|City|State|PostCode|Country|Mobile|Company|Home_Number|Additional_info|Message|
      | emailValid1 |TitleM|  fName1   |  lName      |  passinvalid      |day|month|year|address|city|state|postcode|country|mobile|company|home_number|additional_info|passInvalid|


  Scenario Outline: New user  signup with  invalid name
    Given Home page open
    When User click on signup button
    Then Authentication page open
    When User enter "<Email>"
    Then create an account button is clickable
    When User click on Create new account button
    Then Signup page open successfully
    When User Choose the gender "<Title>"
    And User enter the First Name as "<FirstName>"
    And User enter the Last Name as "<LastName>"
    And User enter the Password as "<Password>"
    And Choose the Day as "<Day>"
    And Choose the Month as "<Month>"
    And Choose the year as "<Year>"
    And User enter Address1 as "<Address>"
    And User enter City as a "<City>"
    And User choose State as "<State>"
    And User enter PostCode as "<PostCode>"
    And User Choose Country as "<Country>"
    And User enter Mobile number as "<Mobile>"
    And User check on offers box
    And User check on newsletter box
    And User enter Company as "<Company>"
    And User enter Home Number as "<Home_Number>"
    And User enter Additional Information as"<Additional_info>"
    Then signup button should be clickable
    When User click on submit button
    Then Error message Appear with the text "<Message>"
    Examples:
      | Email  | Title|FirstName|LastName|Password|Day|Month|Year|Address|City|State|PostCode|Country|Mobile|Company|Home_Number|Additional_info|Message|
      #First name have numbers
      | emailValid1 |TitleM|  fNamenumbers   |  lName      |  pass     |day|month|year|address|city|state|postcode|country|mobile|company|home_number|additional_info|fNameInvalid|
     #Last name have numbers
      | emailValid1 |TitleM|  fName1   |  lNamenumbers      |  pass     |day|month|year|address|city|state|postcode|country|mobile|company|home_number|additional_info|lNameInvalid|
      #First name have special character
      | emailValid1 |TitleM|  fNamespecialCharacters   |  lName      |  pass     |day|month|year|address|city|state|postcode|country|mobile|company|home_number|additional_info|fNameInvalid|
      #Last name have special character
      | emailValid1 |TitleM|  fName1   |  lNamespecialCharacters      |  pass     |day|month|year|address|city|state|postcode|country|mobile|company|home_number|additional_info|lNameInvalid|

  Scenario Outline: New user  signup with  invalid PostCode
    Given Home page open
    When User click on signup button
    Then Authentication page open
    When User enter "<Email>"
    Then create an account button is clickable
    When User click on Create new account button
    Then Signup page open successfully
    When User Choose the gender "<Title>"
    And User enter the First Name as "<FirstName>"
    And User enter the Last Name as "<LastName>"
    And User enter the Password as "<Password>"
    And Choose the Day as "<Day>"
    And Choose the Month as "<Month>"
    And Choose the year as "<Year>"
    And User enter Address1 as "<Address>"
    And User enter City as a "<City>"
    And User choose State as "<State>"
    And User enter PostCode as "<PostCode>"
    And User Choose Country as "<Country>"
    And User enter Mobile number as "<Mobile>"
    And User check on offers box
    And User check on newsletter box
    And User enter Company as "<Company>"
    And User enter Home Number as "<Home_Number>"
    And User enter Additional Information as"<Additional_info>"
    Then signup button should be clickable
    When User click on submit button
    Then Error message Appear with the text "<Message>"

    Examples:
      | Email  | Title|FirstName|LastName|Password|Day|Month|Year|Address|City|State|PostCode|Country|Mobile|Company|Home_Number|Additional_info|Message|
      #postal code have character
      | emailValid2 |TitleF|  fName2   |  lName      |  pass      |day|month|year|address|city|state|postcodeCharacter|country|mobile|companyBlank|home_numberBlank|additional_infoBlank|postcodeRequired|
      #postal code have special character
      | emailValid2 |TitleF|  fName2   |  lName      |  pass      |day|month|year|address|city|state|postcodeSpecialCharacter|country|mobile|companyBlank|home_numberBlank|additional_infoBlank|postCodeInValid|
      #postal code have less than five digits
      | emailValid2 |TitleF|  fName2   |  lName      |  pass      |day|month|year|address|city|state|postcodeLessFive|country|mobile|companyBlank|home_numberBlank|additional_infoBlank|postcodeRequired|
      #postal code have more than five digits
      | emailValid2 |TitleF|  fName2   |  lName      |  pass      |day|month|year|address|city|state|postcodeMoreFive|country|mobile|companyBlank|home_numberBlank|additional_infoBlank|postcodeRequired|

  Scenario Outline: New user  signup with  invalid Mobile Number
    Given Home page open
    When User click on signup button
    Then Authentication page open
    When User enter "<Email>"
    Then create an account button is clickable
    When User click on Create new account button
    Then Signup page open successfully
    When User Choose the gender "<Title>"
    And User enter the First Name as "<FirstName>"
    And User enter the Last Name as "<LastName>"
    And User enter the Password as "<Password>"
    And Choose the Day as "<Day>"
    And Choose the Month as "<Month>"
    And Choose the year as "<Year>"
    And User enter Address1 as "<Address>"
    And User enter City as a "<City>"
    And User choose State as "<State>"
    And User enter PostCode as "<PostCode>"
    And User Choose Country as "<Country>"
    And User enter Mobile number as "<Mobile>"
    And User check on offers box
    And User check on newsletter box
    And User enter Company as "<Company>"
    And User enter Home Number as "<Home_Number>"
    And User enter Additional Information as"<Additional_info>"
    Then signup button should be clickable
    When User click on submit button
    Then Error message Appear with the text "<Message>"
    Examples:
      | Email  | Title|FirstName|LastName|Password|Day|Month|Year|Address|City|State|PostCode|Country|Mobile|Company|Home_Number|Additional_info|Message|
      #mobile number have special character
      | emailValid2 |TitleF|  fName2   |  lName      |  pass      |day|month|year|address|city|state|postcode|country|mobileSpecialCharacter|companyBlank|home_numberBlank|additional_infoBlank|mobileInValid|

      #mobile number have character
      | emailValid2 |TitleF|  fName2   |  lName      |  pass      |day|month|year|address|city|state|postcode|country|mobileCharacter|companyBlank|home_numberBlank|additional_infoBlank|mobileInValid|


