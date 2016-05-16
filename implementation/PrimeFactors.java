package implementation;

import java.util.ArrayList;

public class PrimeFactors {

  public ArrayList<Integer> generate(int n) {
    ArrayList<Integer> factors = new ArrayList();
    for (int possibleFactor = 2; n > 1; possibleFactor++)
      for (; n % possibleFactor == 0; n /= possibleFactor)
        factors.add(possibleFactor);

    return factors;
  }
}
