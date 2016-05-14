package step_definitions;

import cucumber.api.java.en.*;
import cucumber.api.PendingException;
import java.util.ArrayList;
import implementation.PrimeFactors;
import static org.junit.Assert.*;

public class PrimeFactorsSteps {
  ArrayList<Integer> factors;

  @When("^I generate the prime factors of (\\d+)$")
  public void iGenerateThePrimeFactorsOf(int n) throws Throwable {
    PrimeFactors primeFactors = new PrimeFactors();
    factors = primeFactors.generate(n);
  }

  @Then("^it returns an empty collection$")
  public void itReturnsAnEmptyCollection() throws Throwable {
    ArrayList<Integer> emptyList = new ArrayList<Integer>();
    assertEquals(factors, emptyList);
  }
}
