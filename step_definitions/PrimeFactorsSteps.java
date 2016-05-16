package step_definitions;

import cucumber.api.java.en.*;
import cucumber.api.PendingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import implementation.PrimeFactors;
import static org.junit.Assert.*;

public class PrimeFactorsSteps {
  PrimeFactors primeFactors = new PrimeFactors();
  ArrayList<Integer> factors;

  @When("^I generate the prime factors of (\\d+)$")
  public void iGenerateThePrimeFactorsOf(int n) throws Throwable {
    factors = primeFactors.generate(n);
  }

  @Then("^it returns an empty collection$")
  public void itReturnsAnEmptyCollection() throws Throwable {
    ArrayList<Integer> emptyCollection = new ArrayList<Integer>();
    assertEquals(emptyCollection, factors);
  }

  @Then("^it returns list (.*)")
  public void itReturnsList(List<Integer> expectedFactors) throws Throwable {
    assertEquals(expectedFactors, factors);
  }
}
