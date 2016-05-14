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
  ArrayList<Integer> noFactors;
  ArrayList<Integer> oneFactor;

  private List<Integer> list(int... ints) {
    List<Integer> list = new ArrayList<Integer>();
      for (int i : ints)
          list.add(i);
      return list;
  }

  @When("^I generate the prime factors of (\\d+)$")
  public void iGenerateThePrimeFactorsOf(int n) throws Throwable {
    noFactors = primeFactors.generate(n);
  }

  @Then("^it returns an empty collection$")
  public void itReturnsAnEmptyCollection() throws Throwable {
    assertEquals(noFactors, list());
  }

  @When("^I generate the prime factors of prime (\\d+)$")
  public void iGenerateThePrimeFactorsOfPrime(int prime) throws Throwable {
    oneFactor = primeFactors.generate(prime);
  }

  @Then("^it returns list (\\d+)$")
  public void itReturnsList(int prime) throws Throwable {
    assertEquals(oneFactor, list(prime));
  }
}
