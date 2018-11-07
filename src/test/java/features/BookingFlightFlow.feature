# new feature
# Tags: optional

Feature:
  User wants to book a flight

  Scenario: Booking a flight
    Given the user is registered
    #When chooses to login
    When user provide user name as mercury
    And user provide password as mercury
    And user logs in
    And user fill details and preferences page
    And user confirm details and preferences
    And user select flights
    And user confirm flight selection
    And user fill personal and billing info
    And user confirm info
    Then flight is booked