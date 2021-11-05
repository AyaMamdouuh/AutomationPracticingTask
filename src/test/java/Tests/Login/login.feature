Feature: Login


  Scenario Outline:  user enter right email and password to signin
    Given Home page open
    When User click on signup button
    Then Authentication page open
    When User enter the email "<Email>"
    And User enter the password"<Password>"
    Then Login Submit button is clickable
    When User click on submit signin button
    Then Account Page Open Successfully with username "<UserName>"
    Examples:
    |Email|Password|UserName|
    |email|pass        |userName|

  Scenario Outline:  user enter blank email or password to signin
    Given Home page open
    When User click on signup button
    Then Authentication page open
    When User enter the email "<Email>"
    And User enter the password"<Password>"
    Then Login Submit button is clickable
    When User click on submit signin button
    Then  Error MSG appear with text "<Message>"
    Examples:
      |Email|Password|Message|
      #Keep email field blank
      |emailBlank|pass        |emailRequired|
      #Keep password field blank
      |email|passBlank        |passwordRequired|

  Scenario Outline:  user enter invalid email or password to signin
    Given Home page open
    When User click on signup button
    Then Authentication page open
    When User enter the email "<Email>"
    And User enter the password"<Password>"
    Then Login Submit button is clickable
    When User click on submit signin button
    Then  Error MSG appear with text "<Message>"
    Examples:
      |Email|Password|Message|
      #Enter email with wrong domain
      |emailWrongDomain|pass|invalidEmail|
      #Enter password less five digits
      |email|passinvalid|invalidpassword|
      #Enter email doesn't registered
      |  emailValid1   | pass   |wrongPassword |
      #Enter Wrong password
      |email                |password        |wrongPassword |

  Scenario Outline: User forgot the password and try to reset it
    Given Home page open
    When User click on signup button
    Then Authentication page open
    When User click on forget the password
    Then Forget passwoed page open successfully
    When User enter the email address "<Email>"
    And User click on retrive the password
    Then Confirmation email send successfully

    Examples:
    |Email|
    | mail|

