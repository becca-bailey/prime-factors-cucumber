Feature: Prime Factors
    Scenario: Returns an empty collection
        When I generate the prime factors of 0
        And I generate the prime factors of 1
        Then it returns an empty collection

    Scenario Outline: Returns a prime number
        When I generate the prime factors of <prime>
        Then it returns list <prime>

        Examples:
        | prime |
        | 2     |
        | 3     |
        | 7     |
        | 23    |

    Scenario Outline: Returns two or more prime factors
        When I generate the prime factors of <non-prime>
        Then it returns list <factors>

        Examples:
        | non-prime | factors |
        | 4         | 2, 2    |
        | 6         | 2, 3    |
        | 8         | 2, 2, 2 |
        | 9         | 3, 3    |
        | 49        | 7, 7    |
        | 99        | 3, 3, 11|
