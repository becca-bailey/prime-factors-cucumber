Feature: Prime Factors
    Scenario: Returns an empty collection
        When I generate the prime factors of 0
        And I generate the prime factors of 1
        Then it returns an empty collection

    Scenario Outline: Returns a prime number
        When I generate the prime factors of prime <prime>
        Then it returns list <prime>

        Examples:
        | prime |
        | 2     |
        | 3     |
        | 7     |
        | 23    |
