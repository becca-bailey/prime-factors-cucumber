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

  private List<Integer> list(int... ints) {
    List<Integer> list = new ArrayList<Integer>();
      for (int i : ints)
          list.add(i);
      return list;
  }

  @When("^I generate the prime factors of (\\d+)$")
  public void iGenerateThePrimeFactorsOf(int n) throws Throwable {
    factors = primeFactors.generate(n);
  }

  @Then("^it returns an empty collection$")
  public void itReturnsAnEmptyCollection() throws Throwable {
    assertEquals(list(), factors);
  }

  @Then("^it returns list (\\d+)$")
  public void itReturnsList(int prime) throws Throwable {
    assertEquals(list(prime), factors);
  }

  @Then("^it returns list (\\d+), (\\d+)$")
  public void itReturnsList(int firstPrimeFactor, int secondPrimeFactor) throws Throwable {
    assertEquals(list(firstPrimeFactor, secondPrimeFactor), factors);
  }

  @Then("^it returns list (\\d+), (\\d+), (\\d+)$")
  public void itReturnsList(int firstPrimeFactor, int secondPrimeFactor, int thirdPrimeFactor) throws Throwable {
    assertEquals(list(firstPrimeFactor, secondPrimeFactor, thirdPrimeFactor), factors);
  }
}
