Feature: Prime Factors
    Scenario: Returns an empty collection
        When I generate the prime factors of 0
        And I generate the prime factors of 1
        Then it returns an empty collection
