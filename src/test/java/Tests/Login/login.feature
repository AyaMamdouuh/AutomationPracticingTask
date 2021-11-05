Feature: Login

  Scenario Outline: New user enter right email and password to signin
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

  Scenario Outline: New user enter blank email or password to signin
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
      |emailBlank|pass        |emailRequired|
      |email|passBlank        |passwordRequired|

  Scenario Outline: New user enter invalid email or password to signin
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
      |emailWrongDomain|pass|invalidEmail|
      |email|passinvalid|invalidpassword|
      |  emailValid1   | pass   |wrongPassword |
      |email                |password        |wrongPassword |

